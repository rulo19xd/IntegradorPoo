package com.mycompany.poo.uber;

import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.accounts.User;

public class UberComfort extends Uber {

    public UberComfort(Driver conductor, User usuario, double distanciaKm) {
        super(conductor, usuario, distanciaKm);
    }

    @Override
    protected double getTarifaPorKm() {
        return 200;
    }

    @Override
    public String getDescripcion() {
        return "Viaje Uber Comfort";
    }
}
