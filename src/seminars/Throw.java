package seminars;

public class Throw {
    public static void myInput(int value) throws MyException {
        if (value < 0){
            throw new MyException("Значение отрицтельное");
        }
        System.out.println("Обработка значения текста " + value);
    }
}

