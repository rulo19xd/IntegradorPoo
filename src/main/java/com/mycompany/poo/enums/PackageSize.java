package com.mycompany.poo.enums;

public enum PackageSize {

    SMALL,
    MEDIUM,
    LARGE;

    public double getTarifaPorKm() {
        return switch (this) {
            case SMALL -> 80;
            case MEDIUM -> 120;
            case LARGE -> 180;
        };
    }

    public double calcularPrecio(double distanciaKm) {
        if (distanciaKm <= 0) {
            throw new IllegalArgumentException("La distancia debe ser mayor a 0 km");
        }
        return distanciaKm * getTarifaPorKm();
    }
}