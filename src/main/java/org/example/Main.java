package org.example;

public class Main {

    public static void main(String[] args) {
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            int moneyLast = money;
            int countLast = count;
            //int
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money -= expenses;
                money /= 3;
            } else {
                money += income;
                money -= expenses;
            }

            if (count != countLast) {
                System.out.print("Месяц ");
                System.out.print(month);
                System.out.print(". Денег ");
                System.out.print(moneyLast);
                System.out.print(". Буду отдыхать. Потратил -");
                System.out.print(expenses);
                System.out.print(", затем ещё -");
                System.out.println(money * 3);
            } else if (count == countLast) {
                System.out.print("Месяц ");
                System.out.print(month);
                System.out.print(". Денег ");
                System.out.print(moneyLast);
                System.out.print(". Прийдётся работать. Заработал +");
                System.out.print(income);
                System.out.print(", потратил -");
                System.out.println(expenses);
            }
            countLast = count;
        }
        System.out.print("В итоге он отдыхал: ");
        System.out.print(count);
        System.out.print(" месяцев");
        /*if (){

        }*/
    }
}