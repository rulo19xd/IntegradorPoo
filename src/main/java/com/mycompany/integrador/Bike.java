package com.mycompany.integrador;
public class Bike {
    private Integer id;
    private String license;
    private Account driver;

    public Bike(String license, Account driver) {
        this.license = license;
        this.driver = driver;

    }

    void printDataBike() {
        
        if (license != null && driver != null) {
            
            System.out.println("License: " + license + " - Driver: " + driver.name);

        } else {

            System.err.println("⚠  Aegurate de completar todos los campos");

        }
        
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

    

    

}

