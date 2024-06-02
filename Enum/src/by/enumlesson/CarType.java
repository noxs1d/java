package by.enumlesson;

public enum CarType  {
SPORT("sporT"),COUP,SEDAN,PICK_UP;//enums should be written always in uppercase and
    // if it is consist of som words it should be seperated by _ and without numbers
    // if you want add some number tou should create a variable and methode and constructor
private String carname;
    private CarType( ) {//It is always should be private or default
        System.out.println(this.name()+" "+this.ordinal());//it will run through all enums
    }

    CarType(String carname) {
        this.carname = carname;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carname) {
        this.carname = carname;
    }
}
