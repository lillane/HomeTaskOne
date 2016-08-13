/**
 * Created by Яна on 09.08.2016.
 *
 * Создать программу, проверяющую и сообщающую на экран, является ли целое число,
 * записанное в переменную n, чётным либо нечётным (n – вводит пользователь).
 */
import java.util.Scanner; // класс, позволяющий ввести данные пользователем

public class HomeTaskOneB {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in); // создание объекта для ввода данных пользователем. in - означает "извне".
        System.out.println("Введите число"); // вывод сообщения для нового объекта

        int n = in.nextInt();
        if (n%2 == 0){
            System.out.println ("Четное");
        }
        else {
            System.out.println ("Не четное");
        }

    }
}
