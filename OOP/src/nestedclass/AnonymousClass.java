package nestedclass;

public class AnonymousClass {
    void invoke(){
        System.out.println("Class phantom");
    }
}

class Block{
    AnonymousClass anonymousClass=new AnonymousClass(){
        @Override
        void invoke() {
            System.out.println("calling anonymous");
        }
    };
}
