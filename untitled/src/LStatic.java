public class LStatic {
    static{
        System.out.println("1");
        //value=20; it initializes everywhere except in bad code part
    }
    LStatic(){
        System.out.println("3");
    }
    {
        System.out.println("2");
    }
    static int value;
    static void caller(){
        System.out.println("calling to your mother "+ value);
    }
    public static void main(String[] args) {
        //calls 1 as its static and always will be called first
        System.out.println("4");//calls 4 only
        LStatic lStatic=new LStatic();// calls firstly 2 then calls 3
        LStatic.caller();

        System.out.println(LStatic.value);
        LStatic.value=11;
        LStatic.caller();
        lStatic=null;//It is considered as bad code so in the future dont do like that [BAD CODE PART]
        lStatic.value=15;//it is just to understand. this kind of code rewrites even static block.[BAD CODE PART]
        System.out.println(LStatic.value);

    }
}
