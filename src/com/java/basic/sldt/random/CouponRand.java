package com.java.basic.sldt.random;

import java.security.SecureRandom;
import java.util.*;

/**
 * @author seongnamfc
 * @package com.java.basic.sldt.random
 * @file CouponRand
 * @description
 * @date 2023/03/21
 */
public class CouponRand {

    public static final List<Integer> decimal = new ArrayList<>();
    public static final String[] strArr = {"0","1","2","3","4","5","6","7","8","9",
        "a","b","c","d","e","f","g","h","i","j","k","l","m",
        "n","o","p","q","r","s","t","u","v","w","x","y","z"};
    public static final Integer strArrLength = strArr.length;
    private static int hashRaw = 0;

    public static void main(String[] args) {
        CouponRand cr = new CouponRand();
        for (int i = 0; i < 9999; i++) {
            cr.generteRandomString();
        }
    }

    private String generteRandomString() {
        String frontNum = frontCode();
        String hashNum = getHashCode(); // 2자리
        String lastNum = idRotate(90); // 4자리
        System.out.println("frontNum : " + frontNum + " => length : " + frontNum.length());
        System.out.println("hashNum : " + hashNum + " => length : " + hashNum.length());
        System.out.println("lastNum : " + lastNum + " => length : " + lastNum.length());

        String code = frontNum + hashNum + lastNum;
        System.out.println("couponCode : " + code);
        char[] arrCode = code.toCharArray();
        StringBuilder couponCode = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            couponCode.append(arrCode[i]);
        }

        String tempString = couponCode.toString();
        System.out.println("couponCode : " + tempString);
        System.out.println("couponCode length: " + tempString.length());
        System.out.println("===========================================");
        return tempString;
    }


    /**
     * 1. 난수로 구성된 문자열 생성
     *     1-1. Math.random 을 사용해 0 부터 n-1 사이의 난수를 반환
     *     1-2. 반환된 10진수 난수를 decimal 배열에 저장
     *     1-3. getBase62 함수를 통해 반환된 숫자를 62 진수로 변환([0-9][a-z][A-Z])
     */
    private int getRandomNumber(double mininum, double maximum) {
        double min = Math.ceil(mininum);
        double max = Math.floor(maximum);
        double result = Math.floor(Math.random() * (max - min)) + min;
        return (int) result;
    }


    /**
     * @description 10진수를 62진수로 변환하여 문자열로 반환. 62진수(0-9, a-z, A-Z)
     * @param num
     * @return sb.toString()
     */
    private String getBase62(int num) {
        List<String> result = new ArrayList<>();

        do {
            int mod = num % strArrLength;
            num = (int) (num / strArrLength);
            result.add(strArr[mod]);
        } while (num > 0);

        StringBuilder sb = new StringBuilder();
        for (int i = result.size() - 1; i >= 0; i--) {
            sb.append(result.get(i));
        }

        return sb.toString();
    }

    /**
     * getRandomNumber() 와 getBase62() 함수로 0~61까지의 난수를 생성하고, 이를 62진수로 변환한 문자열을 반환
     * 문자열 앞 부분(8자리)
     * @return
     */
    private String frontCode() {
        StringBuilder frontNum = new StringBuilder();
        for  (int i = 0; i < 8; i++) {
            int n = this.getRandomNumber(0, 62);
            decimal.add(n);
            frontNum.append(getBase62(n));
        }

        return frontNum.toString();
    }

    /**
     * frontCode 에서 생성된 난수를 모두 더하고, 62진수로 변환
     * decimal 배열에 앞 부분에서 생성한 난수들이 저장되어 있음
     * @return
     */
    private String getHashCode() {
        String str = null;
        if (!decimal.isEmpty()) {
            int ttl = 0;
            for (int i = 0; i < 8; i++) {
                ttl += decimal.get(i);
            }
            hashRaw = ttl;
            str = getBase62(ttl);

            decimal.clear();
        }
        return str;
    }

    /**
     * 정수 값을 62진수로 변환한 후, 4자리의 문자열로 만드는 부분
     * 10진수를 62진수로 변환한 후, 그 문자열의 길이를 확인
     * 문자열의 길이가 4자리 미만이면, 앞에 0을 추가하여 4자리 문자열을 만듦
     * @param id
     * @return
     */
    private List<String> getId(int id) {
        String id62 = getBase62(id);
        int strLen = id62.length();
        List<String> res = new ArrayList<>();
        if (strLen < 4) {
            for (int i = 0; i < (4 - strLen); i++) {
                res.add("0");
            }
        }
        char[] arr = id62.toCharArray();
        for (char c : arr) {
            res.add(String.valueOf(c));
        }

        return res;
    }

    /**
     * getId() 로 생성된 4자리 문자열을, 회전시켜 반환
     * getId() 로 생성된 4자리 문자열을, hashRaw 값으로 나눈 나머지를 rotateNum 에 저장하고,
     * rotateNum 만큼 문자열을 회전 시킨 후 문자열로 반환
     *
     * @param id
     * @return
     */
    private String idRotate(int id) {
        List<String> arrId = getId(id);
        int rotateNum = hashRaw % 6;
        for (int i = 0; i < rotateNum; i++) {
            arrId.add(arrId.get(0));
            arrId.remove(0);
        }
        StringBuilder res = new StringBuilder();
        for (String str : arrId) {
            res.append(str);
        }
        return res.toString();
    }


}
