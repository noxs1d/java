package first;

import java.io.IOException;


public class FirstProgram {
    public static void main(String[] args) {


        int x;
        try {
            x=System.in.read();//like this u can enter only character but with Scanner class u can enter the line
            System.out.println("Code: "+ x+" \t value: "+(char)x);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
