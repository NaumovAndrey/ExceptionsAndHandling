package lessons.lesson2;

import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Application {

    public static void nullPointerException(){
        String name = null;
        System.out.println(name.length()); // NullPointerException
    }

    public static void classCastException(){
        Object object = new String("строка");
        File file = (File) object;
        System.out.println(file); // ClassCastException
    }

    public static void numberFormatException(){
        String number = "123q";
        int result = Integer.parseInt(number);
        System.out.println(result);
    }

    public static void unsupportedOperationException(){
        List<Object> emptyList = Collections.emptyList();
        emptyList.add(new Object());
    }
}
