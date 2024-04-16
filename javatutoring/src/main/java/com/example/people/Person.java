package com.example.people;

import com.example.phones.AppleDevice;

public class Person {
    String name;
    AppleDevice smartPhone;

    public Person(String name, AppleDevice smartPhone) {
        this.name = name;
        this.smartPhone = smartPhone;
    }

    public void chargeSmartPhone() {
        System.out.println("Charging " + name + "'s phone");
        smartPhone.chargeWithLightning();
    }
}
