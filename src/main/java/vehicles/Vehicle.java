package vehicles;

import accounts.Account;

public class Vehicle {
    
    private Integer id;
    private String license;
    private Account driver;
    private Integer passenger;

    public Vehicle(String license, Account driver, Integer passenger) {
        this.license = license;
        this.driver = driver;
        this.passenger = passenger;
    }

    public String getLicense() {
        return license;
    }

    public Account getDriver() {
        return driver;
    }

    public Integer getPassenger() {
        return passenger;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    public void setPassenger(Integer passenger) {
        this.passenger = passenger;
    }

   
    
}

