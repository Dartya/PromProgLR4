package com.company;

        import java.util.HashMap;
        import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap hmCountry = new HashMap();
        hmCountry.put("0", "Россия");
        hmCountry.put("1", "Беларусь");
        hmCountry.put("2", "Украина");
        HashMap hmCountryInfo = new HashMap();
        hmCountryInfo.put("0", "Население 145 миллионов человек");
        hmCountryInfo.put("1", "Население 10 миллионов человек");
        hmCountryInfo.put("2", "Население 45 миллионов человек");
        Scanner scanner = new Scanner(System.in);
        String comand = "";

        while (!comand.equals("exit")) {
            System.out.println("Введите номер страны, чтобы получить информацию о ней, для выхода введите exit:");
            for (int i = 0; i < 3; i++) {
                System.out.println(i + ". " + hmCountry.get("" + i));
            }

            comand = scanner.next();
            if ((comand.equals("0")) || (comand.equals("1")) || (comand.equals("2")))
                System.out.println("" + hmCountryInfo.get(comand));
            else if (comand.equals("exit"))
                System.out.println("Завершение работы...");
            else
                System.out.println("Неверная команда!");
        }
    }
}