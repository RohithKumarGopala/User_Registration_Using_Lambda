package com.userRiagstrationUsingLambda;

public class DetailsOfUser { String firstName;

    String FirstName;
    String LastName;
    String Email;
    String MobileNumber;

    public DetailsOfUser(String firstName,String LastName,String Email,String MobileNumber){
        this.firstName=firstName;
        this.LastName = LastName;
        this.Email = Email;
        this.MobileNumber=MobileNumber;
    }
    public DetailsOfUser(){}

    public DetailsOfUser(String nextLine) {
    }
}
