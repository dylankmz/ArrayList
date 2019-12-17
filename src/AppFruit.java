import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AppFruit {

    public static void main(String[] args) {

        ArrayList<Fruit> fruitmandje = new ArrayList<>();

        Fruit f1 = new Fruit();
        f1.setNaam("Kiwi");
        f1.setEetbaar(true);
        fruitmandje.add(f1);

        Fruit f2 = new Fruit();
        f2.setNaam("Apple");
        f2.setEetbaar(false);
        fruitmandje.add(f2);

        Fruit f3 = new Fruit();
        f3.setNaam("Banaan");
        f3.setEetbaar(true);
        fruitmandje.add(f3);

        System.out.println(fruitmandje.toString());

        fruitmandje.get(0).isEetbaar();

        for (Fruit f : fruitmandje) { //Over de fruitmandje loopen
            System.out.println(f.getNaam());
        }

        Collections.sort(fruitmandje, new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                return o1.getNaam().compareTo(o2.getNaam());
            }
        });
    }
}

