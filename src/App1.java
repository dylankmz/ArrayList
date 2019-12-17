import java.util.ArrayList;

public class App1 {

    public static void main(String[] args) {

        ArrayList<String> besteNamenLijst = new ArrayList(); //Het is een arraylist van de type String.

        besteNamenLijst.add("Eddi");
        besteNamenLijst.add("Dylan");
        besteNamenLijst.add("Key");
        //besteNamenLijst.add(12.4);//Integer !!!GEEEN int
        //besteNamenLijst.add('s');//Character !!!GEEN char

        System.out.println(besteNamenLijst.get(0));// Geeft positie 0 terug.
        System.out.println(besteNamenLijst.size());//Geeft de grootte van de Array.
        System.out.println(besteNamenLijst.remove("Eddi"));

        for (int i = 0; i < besteNamenLijst.size(); i++) {
            System.out.println(besteNamenLijst.get(i));

        }

        String displayname = besteNamenLijst.get(1) + "!";
        System.out.println(displayname);
    }
}
