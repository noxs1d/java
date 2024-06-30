package abstractclass;

public class Main {
    public static void main(String[] args) {
        Graphic graphic=new Circle();
        graphic.draw();
        graphic.call();
        graphic=new Cube();
        graphic.draw();
    }
}
