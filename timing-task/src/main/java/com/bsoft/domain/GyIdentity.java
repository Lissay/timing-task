package com.bsoft.domain;

import java.math.BigDecimal;

public class GyIdentity {
    private String bmc;

    private Long dqz;

    private BigDecimal csz;

    private BigDecimal dzz;

    public String getBmc() {
        return bmc;
    }

    public void setBmc(String bmc) {
        this.bmc = bmc == null ? null : bmc.trim();
    }

    public Long getDqz() {
        return dqz;
    }

    public void setDqz(Long dqz) {
        this.dqz = dqz;
    }

    public BigDecimal getCsz() {
        return csz;
    }

    public void setCsz(BigDecimal csz) {
        this.csz = csz;
    }

    public BigDecimal getDzz() {
        return dzz;
    }

    public void setDzz(BigDecimal dzz) {
        this.dzz = dzz;
    }
}