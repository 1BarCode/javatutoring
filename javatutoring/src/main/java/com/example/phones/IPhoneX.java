package com.example.phones;

public class IPhoneX implements AppleDevice {

    @Override
    public void chargeWithLightning() {
        chargePhone();
    }

    @Override
    public void chargePhone() {
        System.out.println("Charging phone...");
    }

    @Override
    public void powerOn() {
        System.out.println("Powering on phone...");
    }

    @Override
    public void powerOff() {
        System.out.println("Powering off phone...");
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + phoneNumber + "...");
    }

}
