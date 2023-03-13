package com.userRiagstrationUsingLambda;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ValidatingRegistrations {
    public void getFirstName() {
        ValidatingRegistrations user = new ValidatingRegistrations();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first name");
        DetailsOfUser detailsOfUser = new DetailsOfUser(scanner.nextLine());
        Pattern pattern = Pattern.compile("([A-Z]{1,}[a-z]{3,})");
        Matcher matcher = pattern.matcher(detailsOfUser.firstName);
        boolean m = matcher.matches();
        System.out.println(m);
    }
    public static void main(String[] args) {
        ValidatingRegistrations users=new ValidatingRegistrations();
        users.getFirstName();
    }
}

