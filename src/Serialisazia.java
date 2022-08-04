import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Serialisazia {
    public static void main(String[] args) {
        Rabota rabota = new Rabota();
        printName(rabota);
    }

    public static void printName(Object o) {
        try {
            Method method = o.getClass().getDeclaredMethod("printName");
            method.setAccessible(true);
            method.invoke(o);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

