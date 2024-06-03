package by.enumlesson.functionalinteface;


public class Runner {
    public static void main(String[] args) {
        RectangleService rectangleService= RectangleService.AREA;
        System.out.println(rectangleService.get().apply(25.0,4.0));
        RectangleEnum rectangleEnum=RectangleEnum.AREA;
        double res=rectangleEnum.shapeservice(26.0 ,2.0);
        System.out.println(res);
    }
}
