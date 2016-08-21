/**
 * Created by Яна on 09.08.2016.
 *
 * •	В переменных a и b лежат положительные длины катетов прямоугольного треугольника.
 * Вычислить и вывести на экран площадь треугольника и его периметр (a и b – вводит пользователь).
 */

import java.util.Scanner;

public class HomeTaskOneE {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);
        Double a;
        Double b;

        do {
            System.out.println("Введите длину первого катета прямоугольного треугольника: ");
            a = in.nextDouble();

            System.out.println("Введите длину второго катета прямоугольного треугольника: ");
            b = in.nextDouble();
        }
        while (a<=0 || b<=0);

        Double s = (a*b)/2; // Площадь треугольника
        Double p = a+b+Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));     // Периметр треугольника
        System.out.println("Площадь прямоугольного треугольника равна "+s);
        System.out.println("Периметр прямоугольного треугольника равна "+p);
    }
}
