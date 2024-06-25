package inheritance;

public class Rule3 {
    public Rule3() {
        System.out.println("Default constructor of father");
    }
    public Rule3(String name){
        System.out.println("Father Constructor name: "+ name);
    }

}

class SonRule3 extends Rule3{
    public SonRule3(String name) {
        System.out.println("Sons constructor rule #3");
    }
}