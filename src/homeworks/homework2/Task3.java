package homeworks.homework2;
/*Напишите программу, которая запрашивает у пользователя три числа и выполняет следующие проверки:

Если первое число больше 100, выбросить исключение NumberOutOfRangeException с сообщением "Первое число вне допустимого диапазона".
Если второе число меньше 0, выбросить исключение NumberOutOfRangeException с сообщением "Второе число вне допустимого диапазона".
Если сумма первого и второго чисел меньше 10, выбросить исключение NumberSumException с сообщением "Сумма первого и второго чисел слишком мала".
Если третье число равно 0, выбросить исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить сообщение "Проверка пройдена успешно".
- необходимо создать 3 класса собвстенных исключений
 */

import input.Input;
import seminars.MyException;

public class Task3 {
    public static void checks(){
        int valueA = Input.inputUs("Введите делимое: ", Integer.class);
        int valueB = Input.inputUs("Введите делитель: ", Integer.class);
        int valueC = Input.inputUs("Введите делитель: ", Integer.class);

        try {
            if (valueA > 100) { throw new MyException("Первое число вне допустимого диапазона"); }
            if (valueB < 0) { throw new MyException("Второе число вне допустимого диапазона"); }
            if (valueA + valueB < 10) {throw new MyException("Сумма первого и второго чисел слишком мала"); }
            if (valueC == 0) {throw new MyException("Деление на ноль недопустимо"); }
            System.out.println("Проверка пройдена успешно");
        } catch (MyException e){
            System.out.println(e.getMessage());
        }
    }

}