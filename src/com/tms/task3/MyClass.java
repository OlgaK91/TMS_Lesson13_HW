package com.tms.task3;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        System.out.println("Введите 1 или 2");
        Scanner scanner = new Scanner(System.in);
        int inputN = scanner.nextInt();
        scanner.close();
        String string = "ыапвапвп";
        int n = 4;
        doSomeConvertation(inputN, string, n);
    }

    private static void doSomeConvertation(int inputN, String string, int n) {
        if (inputN == 1) {
            MyInterface<String> convInt = (str) -> {
                StringBuffer buffer = new StringBuffer(string);
                buffer.reverse();
                return buffer.toString();
            };
            System.out.println(convInt.getAction(string));
        } else if (inputN == 2) {
            MyInterface<Integer> convInt = (a) -> {
                int res = 1;
                for (int i = 1; i <= a; i++) {
                    res = res * i;
                }
                return res;
            };
            System.out.println(convInt.getAction(n));
        }
        System.out.println();
    }

}
