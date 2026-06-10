package com.mycompany.poo.accounts;

import com.mycompany.poo.vehicles.Vehicle;

public class Driver extends Account {

    private Vehicle vehicle;

    public Driver(
            String name,
            String email,
            String dni,
            String telefono,
            Vehicle vehicle
    ){

        super(name, email, dni, telefono);

        this.vehicle = vehicle;
    }
    public Vehicle getVehicle() {
    return vehicle;
}
}