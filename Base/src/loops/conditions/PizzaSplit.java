package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner=new Scanner(System.in);
        int people=scanner.nextInt();
        int pizza= scanner.nextInt();
        int amount=pizza,x=1;
        while (true){
            if(pizza%people==0){
                break;
            }
            pizza+=amount;
            x++;
        }
        System.out.println(x);


    }
}
