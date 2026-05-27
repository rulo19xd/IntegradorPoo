package com.mycompany.poo.uber;

import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.accounts.User;

public class UberMoto extends Uber {

    public UberMoto(
            Driver driver,
            User user
    ){

        super(driver, user);
    }

    @Override
    public double calculatePrice(double distance){
        return distance * 150;
    }
}