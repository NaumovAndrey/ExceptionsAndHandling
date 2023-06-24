/* Проверка деления на ноль
Напишите программу, которая запрашивает у пользователя два целых числа и выполняет их деление.
Если второе число равно нулю, выбросите исключение ArithmeticException с сообщением "Деление на ноль недопустимо". Иначе выведите результат деления на экран.*/

package homeworks.homework1;


import java.util.Scanner;

public class Task1 {

    public static double division(int a, int b) {
        if (b == 0){
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return (double) a / b;
    }

    public static int inputUser(String text) {
        System.out.print(text + ": ");
        return new Scanner(System.in).nextInt();
    }
}