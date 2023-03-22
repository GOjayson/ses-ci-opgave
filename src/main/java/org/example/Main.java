package org.example;

public class Main {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int sum = add(num1, num2);
        System.out.println(sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}