import homeworks.homework1.Task1;
import homeworks.homework1.Task2;
import homeworks.homework1.Task3;
import viev.Print;

public class Main {
    public static void main(String[] args) {

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

        Task3.sumOfNambers();
    }
}