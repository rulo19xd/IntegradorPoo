package com.mycompany.poo.uber;

import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.accounts.User;
import com.mycompany.poo.enums.PackageSize;
import com.mycompany.poo.services.Servicio;

public class Envio extends Servicio {

    private final Driver repartidor;
    private final PackageSize tamanoPaquete;

    public Envio(Driver repartidor, User usuario, double distanciaKm, PackageSize tamanoPaquete) {
        super(usuario, distanciaKm);
        this.repartidor = repartidor;
        this.tamanoPaquete = tamanoPaquete;
    }

    @Override
    public double calcularPrecio() {
        return distanciaKm * getTarifaPorKm();
    }

    private double getTarifaPorKm() {
        return tamanoPaquete.getTarifaPorKm();
    }

    @Override
    public String getDescripcion() {
        return "Envío " + tamanoPaquete.name().toLowerCase();
    }

    public Driver getRepartidor() {
        return repartidor;
    }

    public PackageSize getTamanoPaquete() {
        return tamanoPaquete;
    }
}
