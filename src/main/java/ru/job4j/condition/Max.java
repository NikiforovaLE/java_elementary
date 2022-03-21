package ru.job4j.condition;

public class Max {
    public static int findMax(int first, int second) {
        return first >= second ? first : second;
    }

    public static int findMax(int first, int second, int third) {
        return findMax(first, findMax(second, third));
    }

    public static int findMax(int first, int second, int third, int fourth) {
        return findMax(first, findMax(second, third, fourth));
    }

}
