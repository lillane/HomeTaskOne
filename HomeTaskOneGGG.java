import java.util.Scanner;

/**
 * Created by Яна on 11.08.2016.
 *
 * Создать класс, который будет хранить в одной целочисленной переменной несколько значений меньшей длины.
 * Например, возраст, вес, рост и год рождения. Добавить методы получения и добавления параметров отдельно.
 */


public class HomeTaskOneGGG{

    public int N[] = {0,0,0,0};

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите Ваш возвраст: ");
        int Year = in.nextInt();

        System.out.println("Введите Ваш вес: ");
        int Weight = in.nextInt();

        System.out.println("Введите Ваш рост: ");
        int Growth = in.nextInt();

        System.out.println("Введите Ваш год рождения: ");
        int Yearofbirth = in.nextInt();

        HomeTaskOneGGG Human = new HomeTaskOneGGG();
        Human.setYear(Year);
        Human.setWeight(Weight);
        Human.setGrowth(Growth);
        Human.setYearofbirth(Yearofbirth);


        System.out.println("Ваш возраст: " + Human.getYear() + " лет.");
        System.out.println("Ваш вес: " + Human.getWeight() + " кг.");
        System.out.println("Ваш рост: " + Human.getGrowth() + " см.");
        System.out.println("Ваш год рождения: " + Human.getYearofbirth() );

        System.out.println(Human.N);

    }

    public void setYear (int year){
        N[0] = year;
    }

    public int getYear() {
        return N[0];
    }

    public void setWeight (int weight) {
        N[1] = weight;
    }

    public int getWeight () {
        return N[1];
    }

    public void setGrowth (int growth){
        N[2] = growth;

    }

    public int getGrowth () {
        return N[2];
    }

    public void setYearofbirth(int yearofbirth){
        N[3] = yearofbirth;
    }

    public int getYearofbirth() {
        return N[3];
    }

}