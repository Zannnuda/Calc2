package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите арифметическое выражение с целыми числами и ");
        System.out.println("операторами сложениям и вычитания, разделенными пробелами:");
        System.out.println("В конце выражения поставьте знак равенства =");

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
       // System.out.println("first = " + a);



        while (sc.hasNext()) {
            String operator = sc.next();
           //System.out.println("operator = " + operator);
            if ("=".equals(operator)) break;

            int b = sc.nextInt();
           // System.out.println("second = " + b);



            if ("+".equals(operator)) {
                a += b;
               // System.out.println("Результат 1= " + a);
            } else if ("-".equals(operator)) {
                a -= b;
               // System.out.println("Результат 2= " + a);
            }

        } sc.close();
            System.out.println("Результат  = " + a);

    }
}


