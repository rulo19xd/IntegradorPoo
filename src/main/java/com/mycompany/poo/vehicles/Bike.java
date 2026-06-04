package com.mycompany.poo.vehicles;

import com.mycompany.poo.enums.BikeType;

public class Bike extends Vehicle {

    private BikeType type;

    public Bike(String brand, String model, String plate, BikeType type) {
        super(brand, model, plate);
        this.type = type;
    }

    public BikeType getType() {
        return type;
    }
}