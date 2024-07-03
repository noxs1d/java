package Clone.sallow;

import java.util.Date;

public class CloneObject implements Cloneable{
    private Date date;
    private String string;

    public CloneObject(Date date, String string) {
        this.date = date;
        this.string = string;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString() {
        return "CloneObject{" +
                "date=" + date +
                ", string='" + string + '\'' +
                '}';
    }
}
