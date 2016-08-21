/**
 * Created by Яна on 09.08.2016.
 *
 * В три переменные a, b и c записаны три вещественных числа.
 * Создать программу, которая будет находить и выводить на экран вещественные корни квадратного уравнения ax^2+bx+c=0,
 * либо сообщать, что корней нет (a, b и c – вводит пользователь).
 */

import java.util.Scanner;

public class HomeTaskOneF {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double a, b, c;
        double D;

        System.out.println("Введите первый пост.коэффициент: ");
        a = in.nextDouble();

        System.out.println("Введите второй пост.коэффициент: ");
        b = in.nextDouble();

        System.out.println("Введите третий пост.коэффициент: ");
        c = in.nextDouble();

        D = Math.pow(b, 2) - 4 * a * c;  // Формула дискмининанта: D = b*b -4*a*c

        if (D>0) {
            double x1 = (-b+Math.sqrt(D)) / 2*a;
            double x2 = (-b-Math.sqrt(D)) / 2*a;
            System.out.println ("Первый корень квадратного уравнения равен " + x1);
            System.out.println ("Второй корень квадратного уравнения равен " + x2);

        } else if (D==0) {
            double x = -b/2*a;
            System.out.println("Корень квадратного уравнения равен " + x);
        } else {
            System.out.println("Корней в данном уравнении нет");
        }
    }
}
