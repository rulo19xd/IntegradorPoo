package com.mycompany.integrador;
class BikeBasic extends Bike {

    String brand;
    String model;

    public BikeBasic(String license, Account driver, String brand, String model) {

        super(license, driver);
        this.brand = brand;
        this.model = model;

    }

}
