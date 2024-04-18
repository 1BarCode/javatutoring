package com.example.phones;

public class IPhoneX implements AppleSmartPhone {
    String owner;
    String modelName;

    public IPhoneX(String owner) {
        this.owner = owner;
        this.modelName = "IPhoneX";
    }

    @Override
    public void chargeWithLightningPort() {
        System.out.println("Charging " + modelName + " with Lightning connector");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number + " with " + modelName);
    }

    @Override
    public void chargeDevice() {
        chargeWithLightningPort();
    }
}
