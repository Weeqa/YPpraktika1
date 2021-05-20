package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contract {

    private String dateOfConclusion;
    private float insuranceAmount;
    private String insuranceType;
    private float tariffRate;
    private int branch;

    public Contract() {}
    public Contract(String dateOfConclusion, float insuranceAmount, String insuranceType, float tariffRate, int branch) {
        this.dateOfConclusion = dateOfConclusion;
        this.insuranceAmount = insuranceAmount;
        this.insuranceType = insuranceType;
        this.tariffRate = tariffRate;
        this.branch = branch;
    }

    public String getDateOfConclusion() {return dateOfConclusion;}
    public float getInsuranceAmount() {return insuranceAmount;}
    public String getInsuranceType() {return insuranceType;}
    public float getTariffRate() {return tariffRate;}
    public int getBranch() {return branch;}

    public void create() {
        System.out.print("Введите дату заключения договора: ");
        Scanner in = new Scanner(System.in);
        dateOfConclusion = in.nextLine();

        System.out.print("Введите страховую сумму: ");
        Scanner in1 = new Scanner(System.in);
        try {
            insuranceAmount = in1.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Oшибка");
        }

        System.out.print("Введите тип страхования: ");
        Scanner in2 = new Scanner(System.in);
        insuranceType = in2.nextLine();

        System.out.print("Введите тарифную ставку: ");
        Scanner in3 = new Scanner(System.in);
        try {
            tariffRate = in3.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Oшибка");
        }

        System.out.print("Введите номер филлиала: ");
        Scanner in4 = new Scanner(System.in);
        try {
            branch = in4.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Oшибка");
        }
    }

    public void about() {
        System.out.println();
        System.out.println("         Договор      ");
        System.out.println("                             Дата: " + dateOfConclusion);
        System.out.println("Вид страхования: " + insuranceType);
        System.out.println("Страховая сумма: " + insuranceAmount);
        System.out.println("Тарифная ставка: " + tariffRate);
        System.out.println("Номер филиала: " + branch);
    }

    public double rate() {
        return (insuranceAmount / tariffRate);
    }
}
