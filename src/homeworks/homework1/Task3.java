/*Чтение файла и подсчет суммы чисел
Напишите программу, которая считывает содержимое текстового файла, в котором каждая строка содержит одно число. Программа должна подсчитать сумму всех чисел в файле.
Если встретится строка, которая не может быть преобразована в число, выбросите исключение NumberFormatException с сообщением "Некорректное значение числа в файле".*/

package homeworks.homework1;

import java.io.*;

public class Task3 {
    public static void sumOfNambers(){
        try {
            File file = new File("E:\\Документы\\Андрей\\Обучение\\GeekBrains\\Exceptions\\ExceptionsAndHandling\\src\\homeworks\\homework1\\task3.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();

            int temp = 0;
            while (line != null) {
                temp = temp  + Integer.parseInt(line);
                line = reader.readLine();
            }
            System.out.println(temp);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("Некорректное значение числа в файле");
        }
    }
}
