package Static;

public class StaticClass {
    private static int x;
    static {
        x=12;
    }
    final int y;
    {
        y=11;
    }
    static void call(){
        System.out.println("Static method calls static field: "+x );
    }
    int getY(){
        return y;
    }
    public static void main(String[] args) {
        StaticClass.call();
        StaticClass.x=10;
        StaticClass.call();
        StaticClass staticClass=new StaticClass();
        System.out.println(staticClass.getY() + staticClass.y);
    }
}
