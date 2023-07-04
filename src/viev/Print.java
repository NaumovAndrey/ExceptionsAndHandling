package viev;

import java.io.PrintStream;
import java.util.Objects;

public class Print {
    public static void PrintInConsole(int a, int b, double c){
       System.out.printf("Ответ: %d / %d = %f", a, b, c);
    }

    public static void PrintInConsole(int age){
        System.out.printf("Вам %d годиков", age);
    }

    public static void PrintInConsole(int a, int b, int c) {
        System.out.printf("Ответ: %d^%d = %d", a, b, c);
    }
}

