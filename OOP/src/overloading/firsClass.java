package overloading;

public class firsClass {
    static void call(byte x){
        System.out.println("byte "+x);
    }
    static void call(int x){
        System.out.println("int "+x);
    }

    public static void main(String[] args) {
        byte x=11;
        call(x);
        byte y=127;
        call(y+1);
    }
}
