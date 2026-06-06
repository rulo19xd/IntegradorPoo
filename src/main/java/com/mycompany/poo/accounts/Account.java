package com.mycompany.poo.accounts;

public abstract class Account {

    protected String name;
    protected String email;
    protected String dni;
    protected String telefono;

    public Account(String name, String email, String dni, String telefono){

        this.name = name;
        this.email = email;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
    
    public String getDni()  {
        return dni;
    }
    
    public String getTelefono() {
        return telefono;
    }
}