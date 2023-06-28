/*Обработка некорректного ввода
Напишите программу, которая запрашивает у пользователя его возраст.
Если введенное значение не является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод". Иначе выведите возраст на экран.*/

package homeworks.homework1;

import viev.Print;

import java.util.InputMismatchException;

public class Task2 {
    public static void checkingNumber() {
        Integer age = Task1.inputUser("Сколько Вам годиков? ");
        if (age >= 0){
            Print.PrintInConsole(age);
        } else {
            checkingNumber();
        }

        // обработка исключения в первой задаче метод inputUser (ошибка ловиться при вводе)
    }
}
