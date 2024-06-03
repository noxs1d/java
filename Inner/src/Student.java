public class Student extends Person{
    class StundetAdress extends Adress{
        @Override
        int ageGet() {
            return super.ageGet()+10;
        }
    }

}
