import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date dateOfbirth;
    private Adress adress;
    private long phone;
     class Adress{//Can extend any outer class, any quantity of interface.
        // must not have any static object etc.
         //if it were private the owner class could not get access to the methods
        private String country;
        private String city;
        private String house;
        private long phone;

        int ageGet(){//have access to owner class objects
            return age=10;
        }

        public Adress() {
        }

        public Adress(long phone) {
            this.phone=phone+Person.this.phone;//only like this you can call outer field in innner
        }

        class Rooms{
            //can have inner class but it is not recommended to do
        }
    }

    public Person() {
    }
    public Adress getAdress(){//to this method
        return adress;
    }
    public void operation(){
        adress.city="Tashkent";//the way to access inner objects of the inner class
    }
}
