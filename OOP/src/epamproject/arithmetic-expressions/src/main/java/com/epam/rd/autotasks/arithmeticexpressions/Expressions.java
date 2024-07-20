package com.epam.rd.autotasks.arithmeticexpressions;


public class Expressions {
    public static Variable var(String name, int value) {
        //implement this method
        return new Variable(name,value);
    }

    public static Expression val(int value) {
        return new Expression() {
            @Override
            public int evaluate() {
                return value;
            }

            @Override
            public String toExpressionString() {
                return value < 0 ? "(" + value + ")" : Integer.toString(value);
            }
        };
    }

    public static Expression sum(Expression... members){
        return new Expression() {
            @Override
            public int evaluate() {
                int sum=0;
                for(Expression member:members){
                    sum+=member.evaluate();
                }
                return sum;
            }

            @Override
            public String toExpressionString() {
                String string="";
                for (int i = 0; i < members.length; ) {
                    if(i== members.length-1){
                        string+=members[i].toExpressionString();
                        break;
                    }

                    string=members[i++].toExpressionString()+" + ";
                }
                return "("+string+")";
            }
        };
    }

    public static Expression product(Expression... members){
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                int sum=1;
                for(Expression member:members){
                    sum*=member.evaluate();
                }
                return sum;
            }

            @Override
            public String toExpressionString() {
                String string="";
                for (int i = 0; i < members.length; ) {
                    if(i== members.length-1){
                        string+=members[i].toExpressionString();
                        break;
                    }
                    string=members[i].toExpressionString()+" * ";
                    i++;
                }
                return "("+string+")";
            }
        };    }

    public static Expression difference(Expression minuend, Expression subtrahend){
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                return minuend.evaluate()- subtrahend.evaluate();
            }

            @Override
            public String toExpressionString() {
                return "("+minuend.toExpressionString()+" - "+subtrahend.toExpressionString()+")";
            }
        };
    }

    public static Expression fraction(Expression dividend, Expression divisor){
        //implement this method
        return new Expression() {
            @Override
            public int evaluate() {
                return dividend.evaluate()/ divisor.evaluate();
            }

            @Override
            public String toExpressionString() {
                return "("+dividend.toExpressionString()+" / "+divisor.toExpressionString()+")";
            }
        };

    }

}
