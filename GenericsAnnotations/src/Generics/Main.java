package Generics;
public class Main {
    public static void main(String[] args) {
        GenericsClass<Integer> integerGenericsClass=new GenericsClass<>(3);
        System.out.println(integerGenericsClass.getT());
        System.out.println(integerGenericsClass.addOne(4));
        System.out.println(integerGenericsClass.getT());
        GenericsClass<Double> doubleGenericsClass=new GenericsClass<>(3.0);
        System.out.println(integerGenericsClass.equalsNot(doubleGenericsClass));
    }
}

