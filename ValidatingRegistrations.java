package com.userRiagstrationUsingLambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatingRegistrations {
    public void getFirstName() {
        ValidatingRegistrations user = new ValidatingRegistrations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        DetailsOfUser userDetails = new DetailsOfUser(scanner.nextLine());
        Pattern pattern = Pattern.compile("([A-Z]{1,}[a-z]{3,})");
        Matcher matcher = pattern.matcher(userDetails.firstName);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public void getLastName() {
        ValidatingRegistrations user = new ValidatingRegistrations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last name");
        DetailsOfUser userDetails = new DetailsOfUser(scanner.nextLine());
        Pattern pattern = Pattern.compile("([A-Z][a-z]{2,})");
        Matcher matcher = pattern.matcher(userDetails.LastName);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public void getEmail() {
        ValidatingRegistrations user = new ValidatingRegistrations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last name");
        DetailsOfUser userDetails = new DetailsOfUser(scanner.nextLine());
        Pattern pattern = Pattern.compile("[abc]{3}.[a-z]{3}+@[bl]{2}.[co]{2}.[a-z]{2}+");
        Matcher matcher = pattern.matcher(userDetails.Email);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public void getMobileNumber() {
        ValidatingRegistrations user = new ValidatingRegistrations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Last name");
        DetailsOfUser userDetails = new DetailsOfUser(scanner.nextLine());
        Pattern pattern = Pattern.compile("([91]{2}+\\s[0-9]{10})");
        Matcher matcher = pattern.matcher(userDetails.MobileNumber);
        boolean m = matcher.matches();
        System.out.println(m);

       public static void main(String[] args){
            ValidatingRegistrations user = new ValidatingRegistrations();
            user.getFirstName();
            user.getLastName();
            user.getEmail();
            user.getMobileNumber();
        }
    }}

