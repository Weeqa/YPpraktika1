package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		Client client1 = new Client();
		client1.knowName();

		Financier financier1 = new Financier("Алексей", "Москва", "НО124Р", 12333, "Старший финансист");
		Financier financier2 = new Financier("Виктория", "Москва", "РП4567Щ", 12356, "Финансист");

		Contract contract1 = new Contract();

		System.out.println("Составление договора");
		contract1.create();
		contract1.about();
		System.out.println("Имя клиента: " + client1.name());

		Analysis analysis = new Analysis(256.25);

		double value = contract1.getInsuranceAmount() / contract1.getTariffRate();
		System.out.println("\nЗначение: " + value);
		System.out.println("\nСравнить значение с нормативным?\n1-Да  |  2-Нет");
		Scanner in = new Scanner(System.in);
		int i = 0;
		try {
			i = in.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Oшибка");
		}

		if (i == 1) {
			if (value <= analysis.getNormativeValues())
				System.out.println("Значение в норме");
			else
				System.out.println("Значение выше нормативного");
		} else if (i == 2)
			System.out.println("Программа завершена");


    }
}
