package homeworks.homework2;
/*Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление.
Если второе число равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.
 */

import seminars.MyException;

public class Task2 {
    public static double dividingNumbers(int valueA, int valueB) throws MyException {
        if (valueB == 0) throw new MyException("Деление на ноль недопустимо");
        return (double) valueA / valueB;
    }
}
