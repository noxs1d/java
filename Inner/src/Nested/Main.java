package Nested;

public class Main {
    public static void main(String[] args) {
        Owner.NestedClass nestedClass=new Owner.NestedClass();
        nestedClass.method();//how to invoke static nested class
        Owner owner=new Owner();
        Owner.NotStaicClass notStaicClass=owner.new NotStaicClass();//how to invoke not static nested class
        notStaicClass.call();
        Action.StaticService staticService=new Action.StaticService();
        staticService.call();
        Action.StaticService.method();
        Action.NotStaticService notStaticService= new Action.NotStaticService();
        notStaticService.call();
        Action.NotStaticService.method();
        new Action(){}.newSevice2();//u can run code like this
        Action.newService();//and like this

    }
}
