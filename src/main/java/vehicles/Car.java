package vehicles;

import accounts.Account;

public class Car extends Vehicle {
    
    String brand;
    String model;
    
     public Car (String license, Account driver, Integer passenger, String brand, String model) {
            super(license, driver, passenger);
            this.brand = brand;
            this.model = model;
  }
  
}
