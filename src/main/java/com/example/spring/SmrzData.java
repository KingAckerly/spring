package com.example.spring;


import org.apache.commons.lang.StringUtils;

public class SmrzData {
    private String sfzjhm;
    private String sfzjlx;
    private String smrzRL;

    public String getSfzjhm() {
        return sfzjhm;
    }

    public SmrzData setSfzjhm(String sfzjhm) {
        this.sfzjhm = sfzjhm;
        return this;
    }

    public String getSfzjlx() {
        return sfzjlx;
    }

    public SmrzData setSfzjlx(String sfzjlx) {
        this.sfzjlx = sfzjlx;
        return this;
    }

    public String getSmrzRL() {
        return smrzRL;
    }

    public SmrzData setSmrzRL(String smrzRL) {
        this.smrzRL = smrzRL;
        return this;
    }

    @Override
    public String toString() {
        return "SmrzData{" +
                "sfzjhm='" + sfzjhm + '\'' +
                ", sfzjlx='" + sfzjlx + '\'' +
                ", smrzRL='" + smrzRL + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        StringBuffer sb = new StringBuffer();
        if (!StringUtils.isBlank(this.sfzjhm)) {
            sb.append(this.sfzjhm.hashCode());
        }
        if (!StringUtils.isBlank(this.sfzjlx)) {
            sb.append(this.sfzjlx.hashCode());
        }
        System.out.println(sb.toString().hashCode());
        return sb.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (null != obj && obj instanceof SmrzData) {
            SmrzData smrzData = (SmrzData) obj;
            if (String.valueOf(this.sfzjhm).equals(String.valueOf(smrzData.getSfzjhm()))
                    && String.valueOf(this.sfzjlx).equals(String.valueOf(smrzData.getSfzjlx()))) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
