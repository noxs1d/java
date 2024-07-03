package Clone.sallow;

public class CloningObjects  {
    private int id;
    private String name;

    public CloningObjects(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Clone.sallow.CloningObjects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
