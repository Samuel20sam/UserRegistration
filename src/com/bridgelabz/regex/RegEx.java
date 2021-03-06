package com.bridgelabz.regex;

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
        //String pattern  = "^(abc)[.][A-Za-z]*@(bl.co)[.a-z]*$";
        String pattern  = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        return email.matches(pattern);
    }
    public boolean mobile(String mobile) {
        String pattern = "^(91)\\d{10}$";
        return mobile.matches(pattern);
    }
    public boolean password(String password) {
        //String pattern  = "^[a-zA-Z0-9]{8,}$"; // rule 1 -> 8 char
        //String pattern  = "^[(?=.*[a-z])(?=.*[A-Z]).{8,}$"; // rule 2 -> 1 Upper case
        //String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}"; // rule 3 -> 1 number
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}"; // rule 4 -> 1 Special Char
        return password.matches(pattern);
    }
    public static void main(String[] args)
    {
        RegEx regex = new RegEx();
//        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first name:");
//        String firstName = scan.nextLine();
        System.out.println(regex.firstName("Samuel"));

        System.out.println("Enter the last name:");
//        String lastName = scan.nextLine();
        System.out.println(regex.lastName("Elijah"));

//        System.out.println("Enter the email address:");
//        String email = scan.nextLine();
//        System.out.println(regex.email("abc.sam@bl.co.in"));

        System.out.println("Enter the mobile number:");
//        String mobile = scan.nextLine();
        System.out.println(regex.mobile("919600020569"));

        System.out.println("Enter the password:");
//        String password = scan.nextLine();
        System.out.println(regex.password("paSs10wo@$^_rd"));

        System.out.println("Enter the email address:");
//        String email = scan.nextLine();
        System.out.println(regex.email("abc@yahoo.com"));
        System.out.println(regex.email("aabc-100@yahoo.com"));
        System.out.println(regex.email("abc.100@yahoo.com"));
        System.out.println(regex.email("abc111@abc.com"));
        System.out.println(regex.email("abc-100@abc.net"));
        System.out.println(regex.email("abc.100@abc.com.au"));
        System.out.println(regex.email("abc@1.com"));
        System.out.println(regex.email("abc@gmail.com.com"));
        System.out.println(regex.email("abc+100@gmail.com"));
        System.out.println(regex.email("abc123@.com"));
        System.out.println(regex.email(".abc@abc.com"));
        System.out.println(regex.email("abc@%*.com"));
    }
}