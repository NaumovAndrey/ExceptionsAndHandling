import homeworks.homework2.Task1;
import homeworks.homework2.Task2;
import homeworks.homework2.Task3;
import homeworks.homework3.BankAccount;
import homeworks.homework3.InsufficientFundsException;
import homeworks.homework3.InvalidAmountException;
import homeworks.homework3.PowerCalculator;
import input.Input;
import seminars.*;
import viev.Print;

import javax.swing.text.View;

import static seminars.SafeDivisionCalculator.handleDivisionByZeroException;

public class Main {
    public static void main(String[] args) throws MyException {
        //---------- seminar 1 ----------

        //seminars.SeminarOne.taskOne(); // Блок catch
        //seminars.SeminarOne.taskTwo(); // Более одного блока catch (выполняются все операции, программа не останавливается)
        //seminars.SeminarOne.taskThree(); // Вложенный блок catch (программа остановится, как только сработает внешний блок)

        /* Проверка на ошибку прописывается не в методе
        try {
            seminars.SeminarOne.taskFour();
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Ошибка");
            System.out.println(ex);
            System.out.println("Стек вызовов");
            ex.printStackTrace();
        }
        System.out.println("После оператора catch"); */


        // ---------- homework seminar 1 ----------
        // task 1

        //int a = Task1.inputUser("Введите a");
        //int b = Task1.inputUser("Введите b");

        //double difference = Task1.division(a, b);
        //Print.PrintInConsole(a, b, difference);


        // ---------- homework seminar 1 ----------
        // task 2

        //Task2.checkingNumber();
        //p.s. исключение NumberFormatException у меня не срабатывает, пишет бесконечность

        // ---------- homework seminar 1 ----------
        // task 3

        //Task3.sumOfNambers();

        // ---------- lesson 2 ----------

        // NullPointerException (обращение к нулевой переменной)
        //Application.nullPointerException();

        //ClassCastException (Неверное приведение типов, т.е. объект типа String не может быть преобразован к объекту типа file)
        //Application.classCastException();

        //NumberFormatException (преобразование строки в число)
        //Application.numberFormatException();

        //UnsupportedOperationException (неизменяемый объект)
        //Application.unsupportedOperationException();

        //Дописать блок finaly с лекции (скрины кода)

        // ---------- seminar 2 ----------
        //task 1

        /*
        try {
            Throw.myInput(5);

        } catch (MyException e){
            System.out.println("Ошибка " + e.getMessage());
        } finally {
            System.out.println("init finally");
        }*/

        // ---------- seminar 2 ----------
        //task 2

        /*String value = Password.checkPass();
        System.out.println("You pass: " + value);*/

        // ---------- homework seminar 2 ----------
        // task 1

        /*
        int valueA = Input.inputUs("Введите число: ", Integer.class);
        try {
            Task1.positiveNumbers(valueA);
            System.out.println("Число корректно.");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } */

        // ---------- homework seminar 2 ----------
        // task 2

        /*
        int valueA = Input.inputUs("Введите делимое: ", Integer.class);
        int valueB = Input.inputUs("Введите делитель: ", Integer.class);

        try {
            double result = Task2.dividingNumbers(valueA, valueB);
            Print.PrintInConsole(valueA, valueB, result);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }*/


        // ---------- homework seminar 2 ----------
        // task 3

        /*Task3.checks();*/

        // ---------- seminar 3 ----------

        /*
        int valueA = Input.inputUs("число а: ", Integer.class);
        int valueB = Input.inputUs("число B: ", Integer.class);

        try {
            double result = SafeDivisionCalculator.divideNumbers(valueA, valueB);
            System.out.println("Результат деления: " + result);
        } catch (DivisionByZeroException e){
            handleDivisionByZeroException(e);
        }*/

        // ---------- homework seminar 3 ----------
        //task 1

        /*
        int result = PowerCalculator.calculatePower();
        System.out.println(result);*/

        // ---------- homework seminar 3 ----------
        //task 2

        BankAccount account1 = new BankAccount(98045);
        BankAccount account2 = new BankAccount(5980);

        try {
            // Перевод средств со счета 1 на счет 2
            double transferAmount = 900;
            account1.transfer(transferAmount, account2);
            System.out.println("Перевод успешно выполнен");
            System.out.println("Баланс счета 1: " + account1.getBalance());
            System.out.println("Баланс счета 2: " + account2.getBalance());
        } catch (InvalidAmountException | InsufficientFundsException e) {
            System.out.println("Ошибка при переводе: " + e.getMessage());
        }
    }
}