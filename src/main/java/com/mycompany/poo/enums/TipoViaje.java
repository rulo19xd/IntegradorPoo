package com.mycompany.poo.enums;

public enum TipoViaje {

    UBER_X("UberX"),
    MOTO("Uber Moto"),
    COMFORT("Uber Comfort");

    private final String etiqueta;

    TipoViaje(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public double getTarifaPorKm() {
        return switch (this) {
            case UBER_X -> 150;
            case MOTO -> 100;
            case COMFORT -> 200;
        };
    }

    public double calcularPrecio(double distanciaKm) {
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("La distancia debe ser mayor a 0 km");
        }
        return distanciaKm * getTarifaPorKm();
    }
}
