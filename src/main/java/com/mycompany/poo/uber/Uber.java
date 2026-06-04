package com.mycompany.poo.uber;

import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.accounts.User;
import com.mycompany.poo.services.Servicio;

public abstract class Uber extends Servicio {

    protected final Driver conductor;

    public Uber(Driver conductor, User usuario, double distanciaKm) {
        super(usuario, distanciaKm);
        this.conductor = conductor;
    }

    @Override
    public double calcularPrecio() {
        return distanciaKm * getTarifaPorKm();
    }

    protected abstract double getTarifaPorKm();

    public Driver getConductor() {
        return conductor;
    }
}
