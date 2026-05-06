
package com.mycompany.integrador;

public class Integrador {

    public static void main(String[] args) {
        
        //DELIVERY CAR
        Car car2 = new Car ("AAA111", new Account ("prueba paquete auto", "123"));
        Package pack = new Package ("Grande");
        
        DeliveryCar deliveryCar = new DeliveryCar(car2, pack);
        deliveryCar.printDataDelivery();
        
        //DELIVERY BIKE
        Bike bike2 = new Bike ("BBB222", new Account ("prueba paquete moto", "321"));
        Package pack2 = new Package ("Mediano");
        
        DeliveryBike deliveryBike = new DeliveryBike(bike2, pack2);
        deliveryBike.printDataDelivery();
        
        
        // BIKE
        Bike bike = new Bike ("PQJ782", new Account("Lucas Romero", "LMC321"));
        bike.printDataBike();
        
        //UBERBIKE
        UberBike uberBike = new UberBike("AHF973", new Account("Andres Carrizo", "FDOSK37OJF"), "Honda", "XR250");
        uberBike.printDataBike();
        
        // CAR
        Car car = new Car("AMQ258", new Account("Andrés López", "AND123"));        
        car.printDataCar();
        
        // UBERX
        UberX uberX = new UberX("HZI833", new Account("Felipe Molina", "HS73N73HD73JD"), "Ford", "Focus");
        uberX.setPassenger(4);
        uberX.getPassenger();
        uberX.printDataCar();        

        // CARD
        Card card = new Card(3246, 5429983212272529L, (short)611, "06/23");
        card.printPaymentId();
        card.printCardInfo();

        // PAYPAL
        PayPal paypal = new PayPal(3645, "andres@example.com");
        paypal.printPaymentId();
        paypal.printPaypalInfo();

        // CASH
        Cash cash = new Cash(2454);
        cash.printPaymentId();

        // ACCOUNT USER
        User user = new User("Andrés López", "JKLDASY780D", "andres@example.com", "SJ#K=FD987DFNF*");
        user.printAccountInfo();

        // DRIVER USER
        Driver driver = new Driver("Mariana Arango", "KDS98320U453", "mariana@example.com", "JSD&0344-454");
        driver.printAccountInfo();

    }

}