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

    @Override
    public String toString() {
        return "IPhoneX [owner=" + owner + ", modelName=" + modelName + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((modelName == null) ? 0 : modelName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IPhoneX other = (IPhoneX) obj;
        if (owner == null) {
            if (other.owner != null)
                return false;
        } else if (!owner.equals(other.owner))
            return false;
        if (modelName == null) {
            if (other.modelName != null)
                return false;
        } else if (!modelName.equals(other.modelName))
            return false;
        return true;
    }

    // @Override
    // public boolean equals(Object otherIPhoneX) {
    // otherIPhoneX = (IPhoneX) otherIPhoneX;
    // return this.owner.equals(((IPhoneX) otherIPhoneX).owner);
    // }

}
