package seminars;

public class SafeDivisionCalculator {
    public static double divideNumbers(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return a / b;
    }

    public static void handleDivisionByZeroException(DivisionByZeroException e){
        System.out.println("ошибка: " + e.getMessage());
        // Дополнительная обработка исключения на более высоком уровне абстракции
    }


}
