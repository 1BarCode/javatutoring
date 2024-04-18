package com.example.people;

import com.example.phones.AppleSmartPhone;

public class Person {
    private String name;
    private AppleSmartPhone phone;

    public Person(String name, AppleSmartPhone phone) {
        this.name = name;
        this.phone = phone;
    }

    public void chargePhone() {
        phone.chargeWithLightningPort();
    }
}
