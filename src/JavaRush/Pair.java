package JavaRush;

import java.util.Objects;

public class Pair<T,S> {
    private  T integer;
    private S string;


    private Pair(T integer, S string) {
        this.integer = integer;
        this.string = string;
    }
    public static  void main(String[] args) {

    }
    public T getFirst() {
        return integer;
    }
    public void setInteger(T integer){
        this.integer =integer;
    }

    public void setString(S string) {
        this.string = string;
    }

    public S getSecond() {
        return string;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pair <?,?> pair = (Pair<?,?>) obj;
        return (Objects.equals(integer,pair.integer) && Objects.equals(string, pair.string));
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, string);
    }


}
