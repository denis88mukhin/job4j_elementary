package ru.job4j.array;

public class ArrayDefenition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("Размер массива ages равен: " + ages.length);
        System.out.println("Размер массива surnames равен: " + surnames.length);
        System.out.println("Размер массива prices равен: " + prices.length);
        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Denis Mukhin";
        names[2] = "Ivan Ivanov";
        names[3] = "Semen Semenov";
    }
}
