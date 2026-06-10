package com.mycompany.poo.vehicles;

import com.mycompany.poo.enums.CarType;

public class Car extends Vehicle {

    private int passengers;
    private CarType type;

    public Car(
            String brand,
            String model,
            String plate,
            int passengers,
            CarType type
    ) {

        super(brand, model, plate);

        this.passengers = passengers;
        this.type = type;
    }
    public CarType getType() {
        return type;
    }

    public int getPassengers() {
        return passengers;
    }
}