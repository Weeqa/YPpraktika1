package com.company;

public class Branch {

    private int name;
    private String address;
    private int phoneNumber;

    public Branch() {}
    public Branch(int name, String address, int phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getName() {return name;}
    public String getAddress() {return  address;}
    public int getPhoneNumber() {return phoneNumber;}
}
