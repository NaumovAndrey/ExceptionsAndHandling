package input;

import java.util.Scanner;

public class Input {
//    public static String inputUs(String value){
//        System.out.print(value);
//        return new Scanner(System.in).next();
//    }

    public static <T> T inputUs(String value, Class<T> type) {
        System.out.print(value);

        if (type == Integer.class) {
            return type.cast(new Scanner(System.in).nextInt());
        } else if (type == Double.class) {
            return type.cast(new Scanner(System.in).nextDouble());
        } else if (type == String.class) {
            return type.cast(new Scanner(System.in).nextLine());
        }

        throw new IllegalArgumentException("Неподдерживаемый тип данных");
    }

}
