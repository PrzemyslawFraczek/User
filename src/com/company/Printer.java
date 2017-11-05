package com.company;

public class Printer {

    public static void main(String[] args) {
	User [] users = new User[3];
	users[0]= new Admin();
	users[1]= new Developer();
	users[2]= new Guest();

        for (int i = 0; i <users.length ; i++) {
            System.out.println(users[i].printMyRole());

        }

    }
}
