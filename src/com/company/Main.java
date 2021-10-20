package com.company;

public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 4;
        boolean c = a != b;
        boolean d = a != 10;
        System.out.println(c);


        System.out.println(d);

        int i = 20;
        int o = 15;
        boolean p = i > o;
        System.out.println(p);

        int s = 20;
        int g = 15;
        boolean f = s < g;
        System.out.println(f);

        boolean k = 10 >= 10;
        boolean l = 10 >= 4;
        boolean z = 10 >= 20;
        System.out.println(k);
        System.out.println(l);
        System.out.println(z);

        int num = 8;
        switch (num) {

            case 1:
                System.out.println("число равно 1");
                break;
            case 8:
                System.out.println("число равно 8");
                num++;

            case 9:
                System.out.println("число равно 9");
                break;
            default:
                System.out.println("число не равно 1, 8, 9");

        }
        }


    }