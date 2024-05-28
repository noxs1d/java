package ObjectClass;

import java.util.Objects;
class A {
int a;
A(int a) {
    this.a = a;
}
}
public class EQUALS {
    private int id;
    private String name="";
    private int date;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EQUALS equals = (EQUALS) o;
        return id == equals.id && date == equals.date && Objects.equals(name, equals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, date);
    }

    @Override
    public String toString() {
        return "EQUALS{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    public static void main(String[] args) {
        A a1 = new A(1);
        A a2 = new A(1);
        System.out.print(a1 == a2);
        System.out.print(", " + a1.equals(a2));
        System.out.print(", " + Objects.equals(a1, a2));
        System.out.print(", " + Objects.deepEquals(a1, a2));
        EQUALS equals= new EQUALS();
        System.out.println(equals.toString());
    }
}
