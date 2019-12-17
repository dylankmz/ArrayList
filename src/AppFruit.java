import java.util.ArrayList;

public class AppFruit {

    public static void main(String[] args) {

        ArrayList<Fruit> fruitmandje = new ArrayList<>();

        fruitmandje.add(new Fruit());
        Fruit f1 = new Fruit();
        f1.setNaam("Kiwi");
        f1.setEetbaar(true);
        fruitmandje.add(f1);

        Fruit f2 = new Fruit();
        f2.setNaam("Apple");
        f2.setEetbaar(false);
        fruitmandje.add(f2);

        System.out.println(fruitmandje.toString());

        fruitmandje.get(0).isEetbaar();
        fruitmandje.get(15243).isEetbaar();

    }
}
