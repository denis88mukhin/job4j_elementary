package ru.job4j.loop;

public class Mortgage {
    public static int years(double amount, int salary, double percent) {
        int years = 0;
        while (amount > 0) {
            amount = amount * (percent / 100) + amount - salary;
            years++;
        }
        return years;
    }
}
