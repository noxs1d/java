import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NotMain {
    public static void main(String[] args) {
        try(XMLEncoder encoder=new XMLEncoder(new BufferedOutputStream(new FileOutputStream("src/serial.xml")))){
        Main main=new Main(10,10);
        encoder.writeObject(main);
        encoder.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
