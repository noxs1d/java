package Annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface FirstAction{
    int call();
    String sql();
}

@FirstAction(call = 11,sql = "SELECT name")
public class AnnotationsClass {
    public static void doAction(){
        Class base= AnnotationsClass.class;
        FirstAction action=(FirstAction) base.getAnnotation(FirstAction.class);
//        System.out.println(action.call());
        System.out.println(action.sql());
    }

    public static void main(String[] args) {
        doAction();
    }
}

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@interface TestClass{
//The example below shows a TestClass annotation that can be used to mark classes
// (@Target(ElementType.TYPE)). The information on marking with this annotation will
// be included in the Javadoc of the marked class (@Documented) and will also be
// available when running the program (@Retention(RetentionPolicy.RUNTIME)).
// All descendants of the marked classes will also be considered marked (@Inherited).
}