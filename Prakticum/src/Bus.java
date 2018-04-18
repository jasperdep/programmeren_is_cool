import java.util.Dictionary;
import java.util.HashMap;

public class Bus {

    private Buschauffeur buschauffeur;
    private HashMap<String, Mens> stoelen = new HashMap<String, Mens>();

    public Bus(Buschauffeur buschauffeur) {

        this.buschauffeur = buschauffeur;

    }

    public void instappen(Mens mens1, Mens mens2, Mens mens3){

        instappen(mens1);
        instappen(mens2);
        instappen(mens3);

    }


    public Mens uistappen(String name) {



            if (!stoelen.containsKey(name)) {
                System.out.println(name + " zit niet in de bus.");
                return null;
            }
            Mens uitgestapte = stoelen.get(name);
            stoelen.remove(name);
            showInfo(uitgestapte, " is uitgestapt.");
            return uitgestapte;


    }

    public void instappen(Mens mens) {

            String key = mens.getName();
            Mens value = mens;
            this.stoelen.put(key, value);
            showInfo(mens, " is ingestapt.");

    }

    public void showInfo(Mens mens, String actie){

        {

            System.out.println(mens.getName()+ actie);

        }

    }

    private int getCount() {

            return stoelen.size();

    }

    public String toString() {

        return "Er zitten "+ getCount() +" Kinderen in de bus";

    }

}
