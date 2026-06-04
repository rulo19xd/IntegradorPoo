package com.mycompany.poo.uber;

import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.accounts.User;

public class UberMoto extends Uber {

    public UberMoto(Driver conductor, User usuario, double distanciaKm) {
        super(conductor, usuario, distanciaKm);
    }

    @Override
    protected double getTarifaPorKm() {
        return 100;
    }

    @Override
    public String getDescripcion() {
        return "Viaje en moto";
    }
}
