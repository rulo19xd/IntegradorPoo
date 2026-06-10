package com.mycompany.poo.app;

import com.mycompany.poo.accounts.User;
import com.mycompany.poo.accounts.Driver;
import com.mycompany.poo.services.Servicio;
import com.mycompany.poo.uber.Envio;
import com.mycompany.poo.uber.UberX;
import com.mycompany.poo.uber.UberComfort;
import com.mycompany.poo.uber.UberMoto;
import com.mycompany.poo.enums.PackageSize;
import com.mycompany.poo.vehicles.Car;
import com.mycompany.poo.vehicles.Bike;
import com.mycompany.poo.enums.CarType;
import com.mycompany.poo.enums.BikeType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Plataforma {

    private List<User> usuarios = new ArrayList<>();
    private List<Driver> conductores = new ArrayList<>();
    private List<Servicio> historial = new ArrayList<>();

   public Plataforma() {
    conductores.add(new Driver("Carlos", "carlos@mail.com","23412378","2645029338", new Car("Toyota", "Corolla", "ABC123", 4, CarType.UBER_X)));
    conductores.add(new Driver("Ana", "ana@mail.com","19298732","2640933892", new Car("BMW", "Serie3", "DEF456", 4, CarType.UBER_COMFORT)));
    conductores.add(new Driver("Luis", "luis@mail.com","22093241","2647834264", new Bike("Honda", "CB500", "GHI789", BikeType.NORMAL)));
}

    public User crearUsuario(String nombre, String email, String dni, String telefono) {
        User u = new User(nombre, email, dni, telefono);
        usuarios.add(u);
        return u;
    }

    public Servicio pedirViaje(User usuario, String tipo, double distancia) {
        Driver conductor = conductores.get(0);
        Servicio s = switch (tipo) {
            case "UberX" -> new UberX(conductor, usuario, distancia);
            case "UberComfort" -> new UberComfort(conductor, usuario, distancia);
            case "UberMoto" -> new UberMoto(conductor, usuario, distancia);
            default -> throw new IllegalArgumentException("Tipo inválido");
        };
        historial.add(s);
        return s;
    }

    public Servicio pedirEnvio(User usuario, PackageSize tamano, double distancia) {
        Driver repartidor = conductores.get(2);
        Servicio s = new Envio(repartidor, usuario, distancia, tamano);
        historial.add(s);
        return s;
    }

    public List<User> getUsuarios() {
        return usuarios;
    }

    public List<Servicio> getHistorial() {
        return historial;
    }
    
    public Driver getConductorAleatorio(){
        Random random = new Random();
        return conductores.get(random.nextInt(conductores.size()));
    }
    
    
}