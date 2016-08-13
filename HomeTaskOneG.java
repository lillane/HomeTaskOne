import java.util.Scanner;

/**
 * Created by Яна on 11.08.2016.
 *
 * Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
 * Например, возраст, вес, рост и год рождения. Добавить методы получения и добавления параметров отдельно.
 */


public class HomeTaskOneG {
    public static void


    main(String[] args) {
    int N;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возвраст: ");
        int N = in.nextInt();

    public void setYear (int year){
        N = year;
    }

    public Integer getYear() {
        return N;
    }
}
