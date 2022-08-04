import java.io.*;
import java.time.Period;

public class Peson implements Externalizable {
    private String name;
    private int number;

    public Peson(String name , int number){
        this.name = name;
        this.number = number;
    }
    public Peson(){

    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Peson{" + "name='" + name + '\'' + ", number=" + number + '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(getNumber());
        out.writeUTF(getName());


    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
       number =  in.readInt();
       name = in.readUTF();



    }
}

