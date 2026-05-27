package com.mycompany.poo.uber;

import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.accounts.User;

public abstract class Uber {

    protected Driver driver;
    protected User user;

    public Uber(Driver driver, User user){

        this.driver = driver;
        this.user = user;
    }

    public abstract double calculatePrice(double distance);
}