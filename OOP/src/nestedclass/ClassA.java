package nestedclass;
/*
*  INNER CLASS
*/

public class ClassA {
    private int x=10;
    class ClassB{
        void call(){
            System.out.println("Outer x is " +x);
        }
    }
}
