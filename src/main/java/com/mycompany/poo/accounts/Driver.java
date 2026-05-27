package com.mycompany.poo.accounts;

import com.mycompany.poo.vehicles.Vehicle;

public class Driver extends Account {

    private Vehicle vehicle;

    public Driver(
            String name,
            String email,
            Vehicle vehicle
    ){

        super(name, email);

        this.vehicle = vehicle;
    }
}