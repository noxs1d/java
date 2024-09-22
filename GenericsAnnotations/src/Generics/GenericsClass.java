package Generics;
//the most common names of type parameters are:
//
//Е - Element (for elements of collections)
//T - Type (for any type)
//K - Key (for a key)
//V - Value (for a value)
//N - Number (for numerical data)
//S, U, V, etc. - for the 2nd, 3rd, and 4th types of parameters
public class GenericsClass <T extends Number>{
    private T t;

    public GenericsClass(T t) {
        this.t = t;
    }

    public <T> int addOne(T t){
        if (t instanceof Integer) {
            return (Integer) t + 1;
        }
        return 0;
    }
    public <T> boolean equalsNot(GenericsClass<?> d){
        return this.getT()==d.getT();
    }
    public T getT() {
        return t;
    }
}

