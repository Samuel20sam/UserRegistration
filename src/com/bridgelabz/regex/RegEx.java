package com.bridgelabz.regex;

import java.util.Scanner;

public class RegEx {
    public boolean firstName(String name)
    {
        String firstName = "^[A-Za-z]{2,}$";
        return name.matches(firstName);
    }
    public boolean lastName(String name)
    {
        String lastName = "^[A-Za-z]{2,}$";
        return name.matches(lastName);
    }
    public boolean email(String email)
    {
        String pattern  = "^(abc)[.][A-Za-z]*@(bl.co)[.a-z]*$";
//        String pattern  = "^[A-Za-z0-9+_.-]*+@(.+)$";
        return email.matches(pattern);
    }
    public boolean mobile(String mobile) {
        String pattern = "^(91)\\d{10}$";
        return mobile.matches(pattern);
    }
    public boolean password(String password) {
        String pattern  = "^[a-zA-Z0-9]{8,}$";
        return password.matches(pattern);
    }
    public static void main(String[] args)
    {
        RegEx regex = new RegEx();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name:");
//        String firstName = scan.nextLine();
        System.out.println(regex.firstName("Samuel"));

        System.out.println("Enter the last name:");
//        String lastName = scan.nextLine();
        System.out.println(regex.lastName("Elijah"));

        System.out.println("Enter the email address:");
//        String email = scan.nextLine();
        System.out.println(regex.email("abc.sam@bl.co.in"));

        System.out.println("Enter the mobile number:");
//        String mobile = scan.nextLine();
        System.out.println(regex.mobile("919600020569"));

        System.out.println("Enter the password :");
        String password = scan.nextLine();
        System.out.println(regex.password(password));
    }

    
}