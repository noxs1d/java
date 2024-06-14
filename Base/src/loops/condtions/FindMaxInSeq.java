package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {

        // Put your code here
        int x,res;
        Scanner scanner=new Scanner(System.in);
        res=scanner.nextInt();
        while (true){
            x=scanner.nextInt();
            if(x==0){
                break;
            }
            if(res<x){
                res=x;
            }

        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
