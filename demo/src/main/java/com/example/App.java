package com.example;

import com.example.people.Person;
import com.example.phones.AppleSmartPhone;
import com.example.phones.IPhoneX;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String name = "John";

        AppleSmartPhone iPhoneX = new IPhoneX(name);
        Person user1 = new Person(name, iPhoneX);

        user1.chargePhone();
    }
}
