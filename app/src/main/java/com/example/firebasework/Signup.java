package com.example.firebasework;

public class Signup {
    String Name;
    String Email;
    String Password;

    public Signup(String name, String email, String password){
        this.Name= name;
        this.Email = email;
        this.Password = password;
    }
    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

}
