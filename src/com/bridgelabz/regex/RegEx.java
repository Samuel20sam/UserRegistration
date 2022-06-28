package com.bridgelabz.regex;

import java.util.Scanner;

public class RegEx {
    static String firstName = "^[A-Za-z]{2,}$";

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first name :");
        String testName = scan.nextLine();
        if(testName.matches(firstName))
        {
            System.out.println("Thi is valid first name.");
        }
        else {
            System.out.println("Not a valid name");
        }
    }
}