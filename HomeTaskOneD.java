/**
 * Created by Яна on 09.08.2016.
 *
 * Создать программу, выводящую на экран ближайшее к 10 из двух чисел, записанных в переменные m и n.
 * Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45 (n и m – вводит пользователь).
 */

import java.util.Scanner;

public class HomeTaskOneD {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in); // создание объекта для ввода данных пользователем. in - означает "извне".
        Double n;
        Double m;

        System.out.println("Введите первое число:"); // вывод сообщения для нового объекта
        n = in.nextDouble();

        System.out.println("Введите второе число:");
        m = in.nextDouble();

        if (Math.abs(n-10) < Math.abs(m-10)){
            System.out.println("Число, ближайшее к 10: "+n);
        } else {
            System.out.println("Число, ближайшее к 10: "+m);
        }
    }
}
