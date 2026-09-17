/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.formativeassesmentpart1;

import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
class Login {
    
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String phonenumber;
    
    public Login(String firstname, String lastname, String username, String password, String string){
        this.firstname = firstname;
        this.lastname = lastname;
        this.username = username;
        this.password = password;
        this.phonenumber = phonenumber;
    }

       //User name contains underscore and max 5 characters
    public boolean checkUserName (){
        return username.contains("_") && username.length()<= 5;
    }
    
    //Password complexity
    public boolean checkPasswordComplexity() {
        boolean length = password.length()>= 8;
        boolean capital = Pattern.compile("[A-Z]").matcher(password).find();
        boolean number = Pattern.compile("[0-9]").matcher(password).find();
        boolean special = Pattern.compile("[^a-zA-Z0-9]").matcher(password).find();
        return length && capital && number && special;
    }
    //South Afriican number with international code
    public boolean checkCellPhoneNumber(){
        String regex = "^\\+27\\d{9}$";
        CharSequence Phonenumber;
        Phonenumber = null;
        return Pattern.matches(regex, Phonenumber);
    }
    public String registerUser() {
        if(!checkUserName()){
            return "Username is not correctly formatted; please ensure that your user name contains an underscore and is no more than five cjaracters in length.";
        }
        if(!checkPasswordComplexity()){
            return "Password is not correctly formatted; please ensire that the password contains atleast eight characters, a capital letter, a number, and a special character.";
        }
        if (!checkCellPhoneNumber()){
        return "Cell phone number is incorrectly formatted or does not contain internation code.";
        }
        return "User has been registered successfully.";
    }
    public boolean loginUser(String enteredUsername, String enteredPassword){
        return username.equals(enteredUsername) && password.equals(enteredPassword);
    }
    public String returnLoginStatus(boolean loginstatus){
        boolean loginStatus = true;
        if (loginStatus){
            return "Welcome " + firstname + " " + lastname + "It is great to see you again.";
        }
        return "Username or Password is incorrect, please try again.";
    }
}
