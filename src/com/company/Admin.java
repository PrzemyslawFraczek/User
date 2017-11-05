package com.company;

public class Admin extends User {
    private int experience ;

    public int getExperience() {
        return experience;
    }

    @Override
    String printMyRole() {
        return "Jestem Adminiem";
    }
}
