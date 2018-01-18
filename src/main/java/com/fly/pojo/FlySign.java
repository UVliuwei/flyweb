package com.fly.pojo;

import java.util.Date;

public class FlySign extends BasePojo{

    private String signed;

    private Integer continueNum;

    private Integer signNum;

    private Date lastDate;


    public String getSigned() {
        return signed;
    }

    public void setSigned(String signed) {
        this.signed = signed == null ? null : signed.trim();
    }

    public Integer getContinueNum() {
        return continueNum;
    }

    public void setContinueNum(Integer continueNum) {
        this.continueNum = continueNum;
    }

    public Integer getSignNum() {
        return signNum;
    }

    public void setSignNum(Integer signNum) {
        this.signNum = signNum;
    }

    public Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

}