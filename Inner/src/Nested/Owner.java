package Nested;

public class Owner {
    static int num=2;
    int number=3;
    static class NestedClass{
        int num2=num;
        //int number2=number; cannot access to not static fields
        //have only access to static field and methods
        void method(){
            System.out.println("calling function in nested class");
        }
    }
    class NotStaicClass{
        void call(){
            System.out.println("calling function in not static class ");
        }
    }
    interface NestedInterfaca{
        void call();//u can nest interface in class but in local cannot↓
    }
    void NestedInterdaceMetode(){
        interface NestedLocalInterface{
            void call();
        }
    }
}
