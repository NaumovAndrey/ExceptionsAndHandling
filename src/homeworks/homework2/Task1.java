package homeworks.homework2;
/* Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно положительным.
Если число отрицательное или равно нулю, программа должна выбрасывать исключение InvalidNumberException с сообщением "Некорректное число".
В противном случае, программа должна выводить сообщение "Число корректно".
*/

import seminars.MyException;

public class Task1 {
    public static void positiveNumbers(int a) throws MyException {
        if (a <= 0) {
            throw new MyException ("Некорректное число");
        }
    }
}
