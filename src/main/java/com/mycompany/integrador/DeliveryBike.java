/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador;

/**
 *
 * @author Martin
 */
 public class DeliveryBike {
    private Bike bike;
    private Package pack;
    
    public DeliveryBike (Bike bike, Package pack) {
        this.bike = bike;
        this.pack = pack;
    }
    
    public void printDataDelivery() {
        bike.printDataBike();
        System.out.println("Package size:" + pack.getSize());
        
    } 
}