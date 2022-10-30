package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean isMax = left > right;
        int result = isMax ? left : right;
        return result;
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
