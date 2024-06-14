package com.epam.rd.autotasks;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double f=Math.pow(b,2)-4*a*c;
        if(f<0){
            System.out.println("no roots");
        }
        else if(f==0) {
            System.out.println(-(b/(2*a)));
        }
        else if(f>0){
            double d = Math.sqrt(f);
            System.out.println((-b-d)/(2*a)+" "+(-b+d)/(2*a));

        }


    }

}