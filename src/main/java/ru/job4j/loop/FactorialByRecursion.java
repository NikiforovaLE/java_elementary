package ru.job4j.loop;

public class FactorialByRecursion {
    public static int calc(int n) {
        int result = 1;
        if (n < 0) {
            System.out.println("Error. Negative number");
            return -1;
        }
        if (n == 0 || n == 1) {
            return result;
        }
        return n * calc(n - 1);
    }
}
