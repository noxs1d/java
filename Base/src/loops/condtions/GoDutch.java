package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        Scanner scanner =new Scanner(System.in);
        int bill=scanner.nextInt();int friends=scanner.nextInt();
        if(bill<0){
            System.out.println("Bill total amount cannot be negative");
        }
        else {
            if (friends <= 0) {
                System.out.println("Number of friends cannot be negative or zero");

            }
            else {
                bill = bill + (bill / 10);
                bill = bill / friends;
                System.out.println(bill);
            }
        }
    }
}
