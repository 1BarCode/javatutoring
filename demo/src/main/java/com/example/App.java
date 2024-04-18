package com.example;

import com.example.people.Person;
import com.example.phones.AndroidSmartPhone;
import com.example.phones.AppleSmartPhone;
import com.example.phones.IPhoneX;
import com.example.phones.SamsungGalaxy;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        String name = "John";

        AppleSmartPhone iPhoneX = new IPhoneX(name);
        Person<AppleSmartPhone> user1 = new Person<AppleSmartPhone>(name, iPhoneX);

        String name2 = "Jane";
        AndroidSmartPhone samsungGalaxy = new SamsungGalaxy(name2);
        Person<AndroidSmartPhone> user2 = new Person<AndroidSmartPhone>(name2, samsungGalaxy);

        user1.chargePhone();
        user2.chargePhone();
    }
}
