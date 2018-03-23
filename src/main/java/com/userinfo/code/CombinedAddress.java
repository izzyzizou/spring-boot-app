package com.userinfo.code;

public class CombinedAddress {
    private Address primaryAddress;
    private Address secondaryAddress;
    private Address officeAddress;

    protected CombinedAddress(Address primaryAddress, Address secondaryAddress, Address officeAddress){
        this.primaryAddress = primaryAddress;
        this.secondaryAddress = secondaryAddress;
        this.officeAddress = officeAddress;
    }
    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public Address getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(Address secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public Address getOfficeAddress() {
        return officeAddress;
    }

    public void setOfficeAddress(Address officeAddress) {
        this.officeAddress = officeAddress;
    }
}
