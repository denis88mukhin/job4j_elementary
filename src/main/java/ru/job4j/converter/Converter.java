package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float euroToRuble(float value) {
        float rsl = value * 70;
        return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = value * 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(150);
        System.out.println("150 rubles are " + dollar + " dollar.");
        float ruble = Converter.euroToRuble(5);
        System.out.println("5 euro are " + ruble + " ruble.");
        ruble = Converter.dollarToRuble(7.4f);
        System.out.println("7.4 dollar are " + ruble + " ruble.");
    }
}
