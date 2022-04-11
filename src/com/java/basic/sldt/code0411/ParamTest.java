package com.java.basic.sldt.code0411;

import org.junit.Test;

/**
 * @author seongnamfc
 * @package com.java.basic.sldt.code0411
 * @file ParamTest
 * @description
 * @date 2022/04/11
 */
public class ParamTest {

    @Test
    public void test() {
        ParamDto paramDto = new ParamDto();
        paramDto.setBrandId("1");
        paramDto.setCategoryId("2");
        paramDto.setTitle("title");
        paramDto.setOption("85");

        TradeProgram tradeProgram = new TradeProgram(paramDto);
        tradeProgram.request();

        MarketProgram marketProgram = new MarketProgram();
        marketProgram.getRequest();
    }

}
