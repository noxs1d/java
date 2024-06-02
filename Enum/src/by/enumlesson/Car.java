package by.enumlesson;

public class Car {
    public static void main(String[] args) {
    ClassCarType car=new ClassCarType(ClassCarType.SPORT);
    CarType carType=CarType.SPORT;
    System.out.println(carType.getCarname());
        System.out.println(CarType.valueOf("SEDAN").ordinal()+" "+carType.compareTo(CarType.PICK_UP));
        //.valueOf is static method you can initialize enum by string and ordinal displays the place of enum
    }
}
