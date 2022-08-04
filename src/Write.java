import java.io.*;

public class Write {
    public static void main(String[] args)  {

        Peson peson = new Peson("Lev",22);
//        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Externals.out"));
//        out.writeObject(igor);
//        out.writeObject(renat);
//        out.close();
        try {
           ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("person.bin"));
           outputStream.writeObject(peson);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
