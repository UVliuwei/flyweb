package com.fly.pojo;

import java.util.Date;

public class FlyAuthority extends BasePojo{


    private String name;

    private String auth;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth == null ? null : auth.trim();
    }

   
}