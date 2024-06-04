package Nested;

public interface Action {
    static void newService(){}
    default void newSevice2(){}
    public static class StaticService{
        void call(){
            System.out.println("not static call");
        }
        static void method(){
            System.out.println("Static call");
        }
    }
    class NotStaticService{
        void call(){
            System.out.println("not static class not static call");
        }
        static void method(){
            System.out.println("not static class static call");
        }
    }
}
