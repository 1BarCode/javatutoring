package com.example.people;

import com.example.phones.Chargable;

public class Person<T extends Chargable> {
    private String name;
    private T phone;

    public Person(String name, T phone) {
        this.name = name;
        this.phone = phone;
    }

    public void chargePhone() {
        phone.chargeDevice();
    }
}
