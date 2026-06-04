package com.mycompany.poo.uber;

import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.accounts.User;

public class UberX extends Uber {

    public UberX(Driver conductor, User usuario, double distanciaKm) {
        super(conductor, usuario, distanciaKm);
    }

    @Override
    protected double getTarifaPorKm() {
        return 150;
    }

    @Override
    public String getDescripcion() {
        return "Viaje UberX";
    }
}
