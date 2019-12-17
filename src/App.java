import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        ArrayList besteNamenLijst = new ArrayList();

        besteNamenLijst.add("Eddi");
        besteNamenLijst.add("Dylan");
        besteNamenLijst.add("Key");

        System.out.println(besteNamenLijst.get(0));// Geeft positie 0 terug.
        System.out.println(besteNamenLijst.size());//Geeft de grootte van de Array.
        System.out.println(besteNamenLijst.remove("Eddi"));

        for (int i = 0; i < besteNamenLijst.size(); i++) {
            System.out.println(besteNamenLijst.get(i));

        }

        String displayname = ((String)besteNamenLijst.get(1)) + "!";//Extra haakjes zorgt ervoor dat alleen maar deze wordt gecast naar een string.
        System.out.println(displayname);
    }
}
