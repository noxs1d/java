package Anonymous;

public class MAin {
    public static void main(String[] args) {
        AnonymousClass anonymousClass=new AnonymousClass(){
            @Override
            void func1() {
                super.func1();
                System.out.println("Anonymous func1");
                call();
            }
            void call(){
                System.out.println("calling func that not exist in owner class");
            }
        };
        anonymousClass.func1();//Anonymous
        //anonymousClass.call(); we can't call func which was created in anonymous class
        anonymousClass.func2();
        Activate activate=()-> System.out.println("only in functional interface we can use lambda as anonymous");
        activate.void1();
    }
}
