package com.example.college_food_ordering_application.cheffFoodPanel;

public class Chef {

    private String ConfirmPassword, Emailid, Fname, Lname, Mobile, Password;

    // Press Alt+Insert


    public Chef(String area, String city, String confirmPassword, String emailid, String fname, String house, String lname, String mobile, String password, String postcode, String state) {
        ConfirmPassword = confirmPassword;
        Emailid = emailid;
        Fname = fname;
        Lname = lname;
        Mobile = mobile;
        Password = password;
    }
    public Chef() {
    }

    public String getConfirmPassword() {
        return ConfirmPassword;
    }

    public String getEmailid() {
        return Emailid;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getMobile() {
        return Mobile;
    }

    public String getPassword() {
        return Password;
    }
}
