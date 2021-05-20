package com.company;

public class Financier extends Client{

    private String position;

    public Financier(String fullName, String placeOfRegistration, String documents, int phoneNumber, String position) {
        super(fullName, placeOfRegistration, documents, phoneNumber);
        this.position = position;
    }

    @Override
    public void aboutObject() {
        System.out.println("Полное имя: " + getFullName());
        System.out.println("Место регистрации: " + getPlaceOfRegistration());
        System.out.println("Документы: " + getDocuments());
        System.out.println("Номер телефона: " + getPhoneNumber());
        System.out.println("Должность: " + position);
        System.out.println();
    }
}
