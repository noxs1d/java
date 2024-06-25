package inheritance;



public class Main {
    public static void main(String[] args) {
        Son son=new Son(); //chain rule #1
        SonRule2 sonRule2=new SonRule2("Son");
        SonRule3 sonRule3=new SonRule3("Son#3");
        SubRule4 subRule4=new SubRule4();
    }
}
