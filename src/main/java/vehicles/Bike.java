package vehicles;

import accounts.Account;

public class Bike extends Vehicle {
    
    String brand;
    String model;
    
      public Bike (String license, Account driver, Integer passenger, String brand, String model) {
         super(license, driver, passenger);
            this.brand = brand;
            this.model = model;
  }
  
}
