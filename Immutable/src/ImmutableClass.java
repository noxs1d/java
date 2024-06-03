import java.util.Date;
import java.util.Objects;

public class ImmutableClass {// it should not have setters, other methods are allowed to create
    private final String name;//final in order to the object will not be inherited
    private Date birthDate;//private provides that it will be initialized once

    public ImmutableClass(String name) {
        //Constructor to initialize variable before running the code
        this.name = name;
    }

    public ImmutableClass(String name, Date birthDate) {
        this.name = name;
        //Creating copy of data inorder to maintain immutable object
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ImmutableClass that = (ImmutableClass) o;
        return Objects.equals(name, that.name) && Objects.equals(birthDate, that.birthDate);
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }
}
