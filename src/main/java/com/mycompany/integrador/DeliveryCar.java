/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.integrador;

/**
 *
 * @author Martin
 */ 
 public class DeliveryCar {
    private Car car;
    private Package pack;
    
    public DeliveryCar (Car car, Package pack) {
        this.car = car;
        this.pack = pack;
    }
    
    public void printDataDelivery() {
        car.printDataCar();
        System.out.println("Package size:" + pack.getSize());
        
    } 
}