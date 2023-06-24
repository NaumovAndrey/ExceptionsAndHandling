package seminars;

public class SeminarOne {
    public static void taskOne() {
        int[] array = new int[4];
        try {
            System.out.println("До генераци исключения");
            array[7] = 10;
            System.out.println("До этой строки не дойдёт");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка: выход за приделы массива");
        }
        System.out.println("После операции catch");
    }

    public static void taskTwo() {
        int[] arrayOne = {4, 8, 16, 24, 128, 32, 256, 512};
        int[] arrayTwo = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < arrayOne.length; i++) {
            try {
                System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + arrayOne[i] / arrayTwo[i]);
            } catch (ArithmeticException ex) { // деленте на ноль
                System.out.println("Ошибка: деление на ноль");
            } catch (ArrayIndexOutOfBoundsException ex) { // граница массива
                System.out.println("Делитель отсутствует");
            }
        }
    }

    public static void taskThree() {
        int[] arrayOne = {4, 8, 16, 24, 128, 32, 256, 512, 13, 11};
        int[] arrayTwo = {2, 0, 4, 4, 0, 8};

        try { // Внешгий блок try
            for (int i = 0; i < arrayOne.length; i++) {
                try { // Внутренний блок try
                    System.out.println(arrayOne[i] + " / " + arrayTwo[i] + " = " + arrayOne[i] / arrayTwo[i]);
                } catch (ArithmeticException ex) { // деление на ноль
                    System.out.println("Ошибка: деление на ноль (внутренний блок catch)");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ex) { // граница массива
            System.out.println("Делитель отсутствует, фатальгая ошибка, выполнение прервано (внешний блок catch)");
        }
    }

    public static void taskFour() { // genExcepcion
        int[] array = new int[4];
        System.out.println("До генераци исключения");
        array[7] = 15;
        System.out.println("line not displayed");
    }
}

