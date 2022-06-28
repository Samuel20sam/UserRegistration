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
    public static void main(String[] args)
    {
        RegEx regex = new RegEx();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name :");
        String firstName = scan.nextLine();
        System.out.println(regex.firstName(firstName));

        System.out.println("Enter the last name :");
        String lastName = scan.nextLine();
        System.out.println(regex.lastName(lastName));
    }
}