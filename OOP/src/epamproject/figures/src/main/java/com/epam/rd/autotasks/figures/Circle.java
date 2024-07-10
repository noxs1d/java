package com.epam.rd.autotasks.figures;

class Circle extends Figure{
    private double r;
   private Point point;
   Circle(Point point, double rad){
       this.point=point;
       this.r=rad;
   }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public String pointsToString() {
        return "("+point.getX()+","+point.getY()+")";
    }

    @Override
    public Point leftmostPoint() {
        return new Point(point.getX()-r,point.getY());
    }
    @Override
    public String toString() {
        return "Circle[" + pointsToString() + r + "]";
    }
}
