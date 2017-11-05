package com.company;

public class Developer extends User {
    private String programmingLanguage ;

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    @Override
    String printMyRole() {
        return "Jestem użytkownikiem";
    }
}
