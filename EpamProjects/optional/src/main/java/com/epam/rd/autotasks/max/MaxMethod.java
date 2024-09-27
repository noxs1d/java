package com.epam.rd.autotasks.max;

import java.util.OptionalInt;

public class MaxMethod {
    public static OptionalInt max(int[] values) {
        int x=Integer.MIN_VALUE;
        if(values==null || values.length==0){
            return OptionalInt.empty();
        }
        for(int val:values){
            if(val>x){
                x=val;
            }
        }
        return OptionalInt.of(x);
    }
}
