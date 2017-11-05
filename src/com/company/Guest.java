package com.company;

import java.util.Date;

public class Guest extends User{
    private Date loginTime = new Date();

    public Date getLoginTime() {
        return loginTime;
    }

    @Override
    String printMyRole() {
        return "Jestem gościem";
    }
}
