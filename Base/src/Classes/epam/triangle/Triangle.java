package Classes.epam.triangle;
class Triangle {
    private Point a,b,c;
    public Triangle(Point a, Point b, Point c) {
        if(a.getX()==b.getX()&&b.getX()==c.getX()&&a.getX()==c.getX()){
            throw new IllegalArgumentException();
        } if(a.getY()==b.getY()&&b.getY()==c.getY()&&a.getY()==c.getY()){
            throw new IllegalArgumentException();
        }
        this.a=a;
        this.b=b;
        this.c=c;

    }

    public double area() {
        return Math.abs(a.getX()*(b.getY()-c.getY())+ b.getX()*(c.getY()-a.getY())+c.getX()*(a.getY()- b.getY()))/2;
    }

    public Point centroid(){
        double x=(a.getX()+ b.getX()+c.getX())/3;
        double y=(a.getY()+ b.getY()+c.getY())/3;
        return new Point(x,y);
    }

}
