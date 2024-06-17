package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {

int res=values[0];
for(int val:values){
    if(val>res){
        res=val;
    }
}
return res;
    }
}
