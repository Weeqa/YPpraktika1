package com.company;

import java.util.Scanner;

public class Client {

    private String fullName;
    private String placeOfRegistration;
    private String documents;
    private int phoneNumber;

    public Client() {}

    public Client(String fullName) {
        this.fullName = fullName;
    }

    public Client(String fullName, String placeOfRegistration, String documents, int phoneNumber) {
        this.fullName = fullName;
        this.placeOfRegistration = placeOfRegistration;
        this.documents = documents;
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {return fullName;}
    public String getPlaceOfRegistration() {return placeOfRegistration;}
    public String getDocuments() {return documents;}
    public int getPhoneNumber() {return phoneNumber;}

    public void aboutObject() {
        System.out.println("Полное имя: " + fullName);
        System.out.println("Место регистрации: " + placeOfRegistration);
        System.out.println("Документы: " + documents);
        System.out.println("Номер телефона: " + phoneNumber);
        System.out.println();
    }

    public void knowName() {
        System.out.print("Введите имя клиента: ");
        Scanner in = new Scanner(System.in);
        fullName = in.nextLine();
    }

    public String name() {
        return fullName;
    }
}
