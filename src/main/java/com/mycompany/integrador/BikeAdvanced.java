package com.mycompany.integrador;
import java.util.Map;

class BikeAdvanced extends Bike {
    
    Map<String, Map<String, Integer>> typeBikeAccepted;

    public BikeAdvanced(String license, Account driver, Map<String, Map<String, Integer>> typeBikeAccepted) {

        super(license, driver);
        this.typeBikeAccepted = typeBikeAccepted;

    }

}
