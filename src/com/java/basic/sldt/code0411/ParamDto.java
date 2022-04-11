package com.java.basic.sldt.code0411;

/**
 * @author seongnamfc
 * @package com.java.basic.sldt.code0411
 * @file ParamDto
 * @description
 * @date 2022/04/11
 */
public class ParamDto {

    private String brandId;
    private String categoryId;
    private String option;
    private String title;

    public String getBrandId() {
        return brandId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getOption() {
        return option;
    }

    public String getTitle() {
        return title;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
