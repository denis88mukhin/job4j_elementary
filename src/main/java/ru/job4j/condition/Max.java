package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(first, second), max(third, fourth));
    }

    public static void main(String[] args) {
        int whichMore = Max.max(15, 10);
        System.out.println(whichMore);
        whichMore = Max.max(3, 7);
        System.out.println(whichMore);
        whichMore = Max.max(5, 5);
        System.out.println(whichMore);
    }
}
