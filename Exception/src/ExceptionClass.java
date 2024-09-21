public class ExceptionClass {
    static int[] arr = {1, 2, 3, 4, 5, 6};
    public static void main(String[] args) throws MarkException{
        method2();
        try {
            method1();
            int a=11,b=0;
            int c=a/b;//Error will not occur cause method 1 called and it will throw to catch block
        } catch(ArrayIndexOutOfBoundsException exp) {
            System.out.println("Program Error!");
        }
        finally {
            System.out.println("The end?");
        }
        System.out.println("Program Finish!");
//        doJob();
//        doJob3(); to work this part of code u shall add 'throws Exception' after function
        throw new MarkException();
    }
    public static void method1(){
        try {
            int sum = 0;
            for (int i = 0; i <= 6; i += 2) {
                sum += arr[i];
            }
        }catch (ArithmeticException exp){
            System.out.println("Method Error");
        }
    }
    public static void method2(){
        try {
            int a=11,b=0;
            int c=a/b;
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException exp){
            System.out.println("Method2 ArithmeticException Error");
        }
//        catch (ArrayIndexOutOfBoundsException exp){
//            System.out.println("ArrayIndexOutOfBoundsException Error");
//        } It is part not used as in catch block above we add the same exception by | sign

    }
    public static void doJob() throws RuntimeException {
        try {
            doJob2();
        } finally {
            System.out.println("did job");
        }
    }
    public static void doJob2() {
        throw new RuntimeException();
    }
    public static void doJob3() throws Exception {
        try {
            doJob4();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "more info");
        } finally {
            System.out.println("dojob3");
        }
    }
    public static void doJob4() throws Exception {
        throw new Exception();
    }

}
class MarkException extends Exception {
    @Override
    public String getMessage() {
        return "Unacceptable value!";
    }
}