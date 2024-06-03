import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date dateOfbirth;
    private Adress adress;
    class Adress{//Can extend any outer class, any quantity of interface.
        // must not have any static object etc.
        private String country;
        private String city;
        private String house;
        private long phone;
        int ageGet(){//have access to owner class objects
            return age=10;
        }
        class Rooms{
            //can have inner class but it is not recommended to do
        }
    }

    public Person() {
    }
    public void operation(){
        adress.city="Tashkent";//the way to access inner objects of the inner class
    }
}
