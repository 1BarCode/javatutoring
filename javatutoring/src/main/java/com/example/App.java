package com.example;

import com.example.people.Person;
import com.example.phones.AppleDevice;
import com.example.phones.IPhoneX;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        AppleDevice iPhoneX = new IPhoneX();

        Person tai = new Person("Tai", iPhoneX);

        tai.chargeSmartPhone();

    }
}
