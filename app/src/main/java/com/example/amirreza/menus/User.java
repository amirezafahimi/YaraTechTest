package com.example.amirreza.menus;

import org.parceler.Parcel;
import org.parceler.ParcelConstructor;
import org.parceler.ParcelFactory;

@Parcel
public class User {
    private String userName;
    private String password;
    private String email;

    User(String userName, String password, String email){
        this.userName=userName;
        this.password=password;
        this.email=email;
    }



    @ParcelConstructor
    public User(){

    }

    public String getUserName() { return userName; }

    public String getPassword() { return password; }

    public String getEmail() { return email; }

}
