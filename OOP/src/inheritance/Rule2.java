package inheritance;

public class Rule2 {
    public Rule2(String name) {
        System.out.println("Father Constructor name: "+ name);
    }
}

class SonRule2 extends Rule2{
    public SonRule2(String name) {
        super(name);
        System.out.println("Son constructor name: ");
    }
}