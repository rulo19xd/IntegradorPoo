package com.mycompany.poo.accounts;

public abstract class Account {

    protected String name;
    protected String email;

    public Account(String name, String email){

        this.name = name;
        this.email = email;
    }
}