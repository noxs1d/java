package src.com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
        if (radius <= 0) {
            throw new IllegalArgumentException("Degenerate circle.");
        }
    }


    public double area() {
        return Math.PI * radius * radius;
    }


    public String pointsToString() {
        return center.toString();
    }


    public Point leftmostPoint() {
        return new Point(center.getX() - radius, center.getY());
    }

    @Override
    public Point centroid() {
        return center;
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (!(figure instanceof Circle)) {
            return false;
        }
        Circle other = (Circle) figure;
        return this.center.equals(other.center) && Math.abs(this.radius - other.radius) < 1e-9;
    }

    @Override
    public String toString() {
        return "Circle[" + pointsToString() + radius + "]";
    }
}
