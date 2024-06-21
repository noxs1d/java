package Classes.epam.intersection;

public class Line {
     int k,b;
    public Line(int k, int b) {
    this.b=b;
    this.k=k;
    }

    public Point intersection(Line other) {
        if(this.k!=0 && other.k!=0 && this.k!= other.k){
        int x,y;
        x= (other.b-this.b)/(this.k- other.k);
        y=x*this.k+this.b;
        return new Point(x,y);
        }
        else {
            return null;
        }
    }

}
