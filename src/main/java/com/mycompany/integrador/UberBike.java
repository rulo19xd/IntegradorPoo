package com.mycompany.integrador;
class UberBike extends BikeBasic {
    
    public UberBike(String license, Account driver, String brand, String model) {
        
        super(license, driver, brand, model);

    }

    @Override
    void printDataBike() {
        
        super.printDataBike();
        System.out.println("Modelo → " + model + " Brand → " + brand);

    }

}