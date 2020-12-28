package com.java.lessons.hello;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World, 3rd try!");

        byte a = 11;
        System.out.println("byte a = " + a);

        short b = -3555;
        System.out.println("short b = " + b);

        int b1 = 605050505;
        System.out.println("int b1 = " + b1);

        long c = 4445323253L;
        System.out.println("long c = " + c);

        long c1 = 434_322_123_434L;
        System.out.println("long c1 = " + c1);

        float d = 43.21f;
        double e = 43.2331d;
        System.out.println("float d = " + d);
        System.out.println("double e = " + e);


        double allValuesSum = a + b + b1 + c + c1 + d + e;
        System.out.println("Sum of all values = " + allValuesSum);

        float someValuesDivide = d / 3;
        System.out.println("Divide of the b to 3 = " + someValuesDivide);

        char char1 = '\u00A9';
        char char2 = '\u2665';
        char char3 = '\u0783';


        System.out.println();
        System.out.println("Characters");
        System.out.println("char1 = " + char1);
        System.out.println("char2 = " + char2);
        System.out.println("char3 = " + char3);

        int charactersSum = char1 + char2 + char3;

        System.out.println("Sum of the characters = " + char1 + char2 + char3);
        System.out.println("Int sum of the characters = " + charactersSum);

        System.out.println();
        double testDouble = b1;

        System.out.println(b1);
        System.out.println(testDouble);// E8 значит на сколько надо умножить данное число что бы было как int значение, тобишь на 10 в 8 степени = 100000000
    }
}
