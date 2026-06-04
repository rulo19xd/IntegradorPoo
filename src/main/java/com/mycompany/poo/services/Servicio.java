package com.mycompany.poo.services;

import com.mycompany.poo.accounts.User;

public abstract class Servicio {
    protected User usuario;
    protected double distanciaKm;

    public Servicio(User usuario, double distanciaKm) {
        this.usuario = usuario;
        this.distanciaKm = distanciaKm;
    }

    public abstract double calcularPrecio();

    public abstract String getDescripcion();

    public User getUsuario() {
        return usuario;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }
}