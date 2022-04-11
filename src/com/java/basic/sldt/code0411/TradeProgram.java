package com.java.basic.sldt.code0411;

/**
 * @author seongnamfc
 * @package com.java.basic.sldt.code0411
 * @file TradeProgram
 * @description
 * @date 2022/04/11
 */
public class TradeProgram {

    private ParamDto paramDto;

    public TradeProgram(ParamDto paramDto) {
        this.paramDto = paramDto;
    }

    public void request() {
        MarketProgram marketProgram = new MarketProgram();
        marketProgram.call(this.paramDto);
    }

}
