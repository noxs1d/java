package datatpye;

public class DataClass {
    public static void main(String[] args) {
        byte var1 = -35;
        short var2 = 0b1011;
        int var3 = 0x51b;
        int var4 = 071;
        long x=10_000;
        long y=1550L; //primitive stores in stack
        long num=(x>y) ? ~y : ~x;//ternary operator
        System.out.println(num);// 0 becomes 1 and 1 becomes 0
        System.out.println(x&y);//bitwise operators
        String string="smth";//stores in heap, but in stuck there is a reference
        System.out.println(x>0 && y<5_000);//logical operator
        System.out.println(math(x,y));
        var var=2;
        System.out.println(var3>>var);
        System.out.println(var3>>>var);
        int s = 304111;//if it is short it will give exception out of range
        short s1 = (short) 304111;
        System.out.println(s + " "+ s1);

    }
    static int math(long x, long y){
        return Math.abs((int)Math.max(Math.sqrt((double)x),Math.cbrt((double)y)));//math
    }
}
