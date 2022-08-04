import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Read {

    public static void main(String[] args) {
//        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Externals.out"));
//        igor = (Logon) in.readObject();
//        renat = (Logon) in.readObject();
        try  {
          ObjectInputStream in = new ObjectInputStream(new FileInputStream("person.bin"));
            Peson peson = (Peson) in.readObject();
            System.out.println(peson);
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
