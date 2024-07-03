package Clone;

import Clone.deep.Student;
import Clone.sallow.CloneObject;
import Clone.sallow.CloningObjects;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        Date date=new Date(System.currentTimeMillis());
        System.out.println("\tDeep Cloning");
        Student stud1 = new Student(date, 201);
        System.out.println(stud1);
        Student stud2 = (Student) stud1.clone();
        System.out.println(stud2);
        System.out.println("\tShallow");
        CloneObject cloneObject =new CloneObject(date,"With inteface");
        System.out.println(cloneObject);
        CloneObject object=(CloneObject) cloneObject.clone();
        System.out.println(object);
        CloningObjects cloningObjects=new CloningObjects(41,"Joseph");
        System.out.println(cloningObjects);
        CloningObjects clone=(CloningObjects) cloningObjects.clone();
        System.out.println(clone);
    }
}
