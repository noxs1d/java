package nestedclass;

public class StaticClass {
    private String string=" Are ut sure?";
    static int x=11;
    static class InnerStaticClass{
        void statCall(){
            System.out.println("Static Calling x is "+x);
        }
    }
}
