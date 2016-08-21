/**
 * Created by Яна on 09.08.2016.
 */
public class Dog {
    String name;
    String says;

    public static void main (String[] args) {
        Dog DogA = new Dog();
        DogA.name = "spot";
        DogA.says = "Ruff!";

        System.out.println(DogA.name);
        System.out.println(DogA.says);

        Dog DogB = new Dog();
        DogB.name = "scruffy";
        DogB.says = "Wyrf!";

        System.out.println(DogB.name);
        System.out.println(DogB.says);
    }
}
