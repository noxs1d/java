import static java.lang.System.out;
import static java.lang.Math.*;
public final class LFinal {//if class final it will not have child classes
    private final int random_number=101;
    private int x;
    //random_number=123; initializing final variable calls error
    private final int num2;// not initialized final variable, you should initialize
    // it in each constructor or once in logic block
    {//logic block
        num2=77;// you can initialize final variable
    }
    private final StringBuilder builder= new StringBuilder();
    public void build(){
        builder.append('a');//as itis changing variable you can change it with their own methods
    }

    public int getRandom_number() {
        return random_number;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getNum2() {
        return num2;
    }

    public StringBuilder getBuilder() {
        return builder;
    }

    public final int SumOfnum(){//final methode will not be override in other child classes,
        // but now as it is final class it does not declare it as final methode
        return (int) (cos(x)+sin(x));//there is i import Math class as static & i have not to write MATH. before cos & sin
    }
    public static void main(String[] args) {
        LFinal lFinal=new LFinal();
        lFinal.builder.append('c');
        out.println("As i import java.lang.System.out as a static i dont need any " +
                "more write System before sout. It works for all other imports too");
    }
}
