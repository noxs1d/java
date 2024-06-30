package abstractclass;

public class Cube extends Graphic {
    @Override
    public void call() {
        System.out.println("It is Cube");
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("\3");
    }
}
