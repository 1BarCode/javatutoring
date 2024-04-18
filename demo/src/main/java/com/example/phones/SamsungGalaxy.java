package com.example.phones;

public class SamsungGalaxy implements AndroidSmartPhone {
    String owner;
    String modelName;

    public SamsungGalaxy(String owner) {
        this.owner = owner;
        this.modelName = "Samsung Galaxy";
    }

    @Override
    public void chargeWithUsbCPort() {
        System.out.println("Charging " + modelName + " with USB-C connector");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " with " + modelName);
    }
}
