public class Employee extends Person.Adress{
    public Employee() {
       new Person().super();//the way to inherit inner class
    }
    public Employee(Person person) {
        person.super();//the 2 way to inherit inner class
    }


}
