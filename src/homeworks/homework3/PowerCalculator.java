package homeworks.homework3;

import input.Input;
import java.util.InputMismatchException;

public class PowerCalculator {
    public static int calculatePower() {
        int number;
        int degree;
        while (true) {

            try {
                while (true) {
                    try {
                        number = Input.inputUs("Введите число: ", Integer.class);
                        degree = Input.inputUs("Введите степень: ", Integer.class);
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Некоректное значение");

                    }
                }
                if (number <= 0 || degree < 0) {
                    throw new InvalidInputException("некоректные данные, попробуйте снова");
                }
                break;
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            }
        }
        return (int) Math.pow(number, degree);
    }
}
