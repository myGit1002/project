package com.local.project.db.pojo;

import java.math.BigDecimal;

public class SysEventVerifier {
    private Integer id;

    private BigDecimal average;

    private BigDecimal count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BigDecimal getAverage() {
        return average;
    }

    public void setAverage(BigDecimal average) {
        this.average = average;
    }

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }
}