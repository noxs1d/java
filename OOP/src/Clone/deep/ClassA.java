package Clone.deep;

public class ClassA {
    private int field1 = 100;
    private String field2 = "Hello";
    public int getField1() {
        return field1;
    }
    public String getField2() {
        return field2;
    }
    public ClassA() {}
    public ClassA(ClassA other) {
        this.field1 = other.getField1();
        this.field2 = new String(other.getField2());
    }
}
class Main {
    public static void main(String[] args) {
        ClassA obj1 = new ClassA();
        //...
        ClassA obj2 = new ClassA(obj1);
    }
}
