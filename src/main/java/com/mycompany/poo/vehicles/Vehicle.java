package com.mycompany.poo.vehicles;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected String plate;

    public Vehicle(
            String brand,
            String model,
            String plate
    )
            
    {

        this.brand = brand;
        this.model = model;
        this.plate = plate;
    }
    public String getBrand() {
    return brand;
}

public String getModel() {
    return model;
}

public String getPlate() {
    return plate;
}
}