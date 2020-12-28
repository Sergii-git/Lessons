package com.java.lessons.operators;

public class Operators {
    public static void main(String[] args) {
        // + - / * %
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;
        double e = a / b;
        double f = a * b;
        double g = a % b;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        double z = 16;

        double result1 = 10 * z++;// инкрементирование не работает
        double result2 = 10 * ++z;// инкрементирование работает до умножения
        z += 5;
        z *= 2;
        // *= /= -= +=
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println(z);

        System.out.println();
        System.out.println();

        // == != < > <= >= && || ?:

        int x = 2;
        int y = 10;
        int v = 8;

        int result3 = x > y ? x : y; // если true возвращаем значенеие после знака впороса, если false возвращаем что после двоеточия
        System.out.println("result4 is " + result3);
        int result4 = (x > y) && (y > v) ? v : x;
        System.out.println("result5 is " + result4);


    }
}
