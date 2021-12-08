package com.company;

public class Main {

    public static void main(String[] args) {

        double[] n = {12.2, -10.3, 13.32, 23.4, -1.3, 5.6, -0.2, 1.2, 0.1, 1.2, 5.8, 4.6, -8.2, 1.23, 12.3};
        double result = 0;
        boolean s1 = false;
        int s2 = 0;
        for (double element : n) {
            if (element < 0) {
                s1 = true;
            } else if (element > 0 && s1) {
                result += element;
                s2++;
                System.out.println("Среднее Арифметическое " + result / s2);
            }
        }
    }
}