package by.enumlesson.functionalinteface;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public enum RectangleService implements Supplier<BiFunction> {
    AREA((a,b)->(a*b)),PERIMETER((a,b)->(2*(a+b)));

    BiFunction<Double,Double,Double> biFunction;

    RectangleService(BiFunction<Double,Double,Double> biFunction){
        this.biFunction=biFunction;
    }
    @Override
    public BiFunction<Double,Double,Double> get(){
        return biFunction;
    }
}
