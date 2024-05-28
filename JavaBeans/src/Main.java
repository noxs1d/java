import java.io.Serializable;
import java.util.Objects;

public class Main extends Entity {
    private int id;
    private long date;

    public Main() {
    }

    public Main(int id, long date) {
        this.id = id;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDate() {
        return date;
    }

    public void setDate(long date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Main{" +
                "id=" + id +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return id == main.id && date == main.date;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date);
    }
}
