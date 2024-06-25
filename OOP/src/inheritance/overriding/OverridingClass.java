package inheritance.overriding;

public class OverridingClass {
    void call(){
        System.out.println("Overriding class: father ");
    }
    final void finalCall(){
        System.out.println("final cannot be changed →_← ");
    }
}

class Suboveeride extends OverridingClass{
    @Override
    void call(){
        System.out.println("SubOverriding class: son");
    }
//    @Override
//    final void finalCall(){
//        System.out.println("Cannot be changed???");
//    }
}