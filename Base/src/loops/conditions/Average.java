package com.epam.rd.autotasks;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int sum=0,i=0,x;
        while (true){
            x= scanner.nextInt();
            if(x==0){
                break;
            }
            sum+=x;
            i++;
        }
        System.out.println(sum/i);
    }

}