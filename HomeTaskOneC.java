/**
 * Created by Яна on 09.08.2016.
 *
 * В переменной n хранится натуральное двузначное число.
 * Создайте программу, вычисляющую и выводящую на экран сумму цифр числа n (n – вводит пользователь).
 */
import java.util.Scanner; // класс, позволяющий ввести данные пользователем

public class HomeTaskOneC {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in); // создание объекта для ввода данных пользователем. in - означает "извне".


        int n;
        do {
            System.out.println("Введите двузначное число:"); // вывод сообщения для нового объекта
            n = in.nextInt();
            if (n >= 10 && n <= 99) {
                int a = n % 10;
                int b = n / 10;
                int c = a + b;
                System.out.println("Результат сложения цифр равен: " + c);
                break;
            } else {
                System.out.println("Ошибка!! Введите двузначное целое число!");
            }
        }
        while (true);//(n >= 99 || n <= 10);
    }
}
