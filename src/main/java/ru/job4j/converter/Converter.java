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
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 150;
        expected = 2.5f;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("150 ruble are 2.5 dollar. Test result : " + passed);

        in = 5;
        expected = 350.0f;
        out = Converter.euroToRuble(in);
        passed = expected == out;
        System.out.println("5 euro are 350.0 ruble. Test result : " + passed);

        in = 7.4f;
        expected = 444.0f;
        out = Converter.dollarToRuble(in);
        passed = expected == out;
        System.out.println("7.4 dollar are 444.0 ruble. Test result : " + passed);
    }
}
