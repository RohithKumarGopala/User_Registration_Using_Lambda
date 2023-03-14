package com.userRiagstrationUsingLambda;


public class DetailsOfUser { String firstName;

    private String FirstName;
    private String  lastName;
    private String  emailAddress;
    private String  password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String mobileNo;

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public DetailsOfUser(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public DetailsOfUser(String emailAddress){
        this.emailAddress=emailAddress;
    }
    public DetailsOfUser(){}

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}