package com.epam.rd.autotasks.figures;

class Triangle extends Figure {
    private Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (area() == 0) {
            throw new IllegalArgumentException("Degenerate triangle.");
        }
    }


    public double area() {
        return Math.abs(a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2.0;
    }


    public String pointsToString() {
        return a.toString() + b.toString() + c.toString();
    }


    public Point leftmostPoint() {
        Point leftmost = a;
        if (b.getX() < leftmost.getX()) leftmost = b;
        if (c.getX() < leftmost.getX()) leftmost = c;
        return leftmost;
    }

    @Override
    public Point centroid() {
        double centroidX = (a.getX() + b.getX() + c.getX()) / 3;
        double centroidY = (a.getY() + b.getY() + c.getY()) / 3;
        return new Point(centroidX, centroidY);
    }

    @Override
    public boolean isTheSame(Figure figure) {
        if (!(figure instanceof Triangle)) {
            return false;
        }
        Triangle other = (Triangle) figure;
        return containsSamePoints(other.a, other.b, other.c);
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
        return (a.equals(point) || b.equals(point) || c.equals(point));
    }
}
