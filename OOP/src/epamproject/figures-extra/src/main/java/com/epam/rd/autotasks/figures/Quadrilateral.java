package com.epam.rd.autotasks.figures;

class Quadrilateral extends Figure{

    private Point a, b, c, d;

    public Quadrilateral(Point a, Point b, Point c, Point d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (area() == 0 || !isConvex()) {
            throw new IllegalArgumentException("Degenerate or non-convex quadrilateral.");
        }
    }

    private boolean isConvex() {
        return (crossProduct(a, b, c) * crossProduct(a, b, d) < 0) &&
                (crossProduct(b, c, d) * crossProduct(b, c, a) < 0) &&
                (crossProduct(c, d, a) * crossProduct(c, d, b) < 0) &&
                (crossProduct(d, a, b) * crossProduct(d, a, c) < 0);
    }

    private double crossProduct(Point p1, Point p2, Point p3) {
        return (p2.getX() - p1.getX()) * (p3.getY() - p2.getY()) - (p2.getY() - p1.getY()) * (p3.getX() - p2.getX());
    }

    public double area() {
        Triangle t1 = new Triangle(a, b, c);
        Triangle t2 = new Triangle(a, c, d);
        return t1.area() + t2.area();
    }

    public String pointsToString() {
        return a.toString() + b.toString() + c.toString() + d.toString();
    }


    public Point leftmostPoint() {
        Point leftmost = a;
        if (b.getX() < leftmost.getX()) leftmost = b;
        if (c.getX() < leftmost.getX()) leftmost = c;
        if (d.getX() < leftmost.getX()) leftmost = d;
        return leftmost;
    }

    @Override
    public Point centroid() {
        double centroidX = (a.getX() + b.getX() + c.getX() + d.getX()) / 4;
        double centroidY = (a.getY() + b.getY() + c.getY() + d.getY()) / 4;
        return new Point(centroidX, centroidY);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (!(figure instanceof Quadrilateral)) {
            return false;
        }
        Quadrilateral other = (Quadrilateral) figure;
        return containsSamePoints(other.a, other.b, other.c, other.d);
    }

    private boolean containsSamePoints(Point... points) {
        for (Point point : points) {
            if (!containsPoint(point)) {
                return false;
            }
        }
        return true;
    }

    private boolean containsPoint(Point point) {
        return (a.equals(point) || b.equals(point) || c.equals(point) || d.equals(point));
    }
}
