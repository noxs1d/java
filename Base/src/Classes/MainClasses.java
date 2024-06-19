package Classes;

import java.util.Objects;

public class MainClasses {
    int data;
    String name;

    public MainClasses() {
    }

    @Override
    public String toString() {
        return "MainClasses{" +
                "data=" + data +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MainClasses that = (MainClasses) o;
        return data == that.data && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, name);
    }

    public MainClasses(int data, String name) {
        this.data = data;
        this.name = name;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
