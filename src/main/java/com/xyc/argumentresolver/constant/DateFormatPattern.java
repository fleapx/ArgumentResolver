package com.xyc.argumentresolver.constant;

/**
 * Created by xyc on 2017/7/29 0029.
 */
public enum DateFormatPattern {
    YYYY_MM_DD("yyyy-MM-dd"), YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd hh:mm:ss");
    private String value;

    DateFormatPattern(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
