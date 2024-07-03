package interfacelesson;

public interface Interface1 {
    int x=11;
    public static double y=2;
    void call();
    public abstract int num(int x);
    default void method(){
        call();
        System.out.println("Calling from interface");
    }
 }

