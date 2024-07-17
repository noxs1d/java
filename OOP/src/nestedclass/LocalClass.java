package nestedclass;
/*
*   Local Class
*/
public class LocalClass {
    private int x=10;
    private String y="Ouster Class x is ";
    void callClass(){
        class InnerClass{
            void call(){
                System.out.println(y+x);
            }
        }
        new InnerClass().call();
    }
}
