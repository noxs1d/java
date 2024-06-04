package localclass;

public class LocalClass {
    private int number=2;
    private static int number1=3;
    void classLocal() {
        //new innerClass(); cannot announce object before class created
        class innerClass{
            int num=number;
            void call(){//to invoke this function you should after class create object of
                // this class and invoke this class
                System.out.println("Inner void");
            }
        }
        new innerClass().call();//like this
    }
    static void staticLocal(){
        class staticInner{
            //int num=number; cannot access to owners field
            int num=number1;//it has access only to static fields
            void staticCall(){
                System.out.println("inner static call");
            }
        }
        new staticInner().staticCall();//like this

    }
}
