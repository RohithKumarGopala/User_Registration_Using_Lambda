package com.userRiagstrationUsingLambda;

public class DetailsOfUser { String firstName;

    String FirstName;
    String LastName;
    String Email;
    String MobileNumber;
    String Password;

    public DetailsOfUser(String firstName,String LastName,String Email,String MobileNumber,String Password){
        this.firstName=firstName;
        this.LastName = LastName;
        this.Email = Email;
        this.MobileNumber=MobileNumber;
        this.Password= Password;
    }
    public DetailsOfUser(){}

    public DetailsOfUser(String nextLine) {
    }
}