import java.util.ArrayList;
import java.util.HashMap;

public class Wagon {

    private int wagonNummer;
    private HashMap<String, Reiziger> eersteKlasse = new HashMap<String, Reiziger>();
    private HashMap<String, Reiziger> tweedeKlasse = new HashMap<String, Reiziger>();
    private HashMap<String, Reiziger> wc = new HashMap<String, Reiziger>();

    public Wagon(int wagonNummer){
        this.wagonNummer = wagonNummer;
    }

    public int getWagonNummer(){
        return this.wagonNummer;
    }


    public void instappen(Reiziger reiziger){

        if (reiziger.getKlasse() == 1){
            String key = reiziger.getName();
            Reiziger value = reiziger;
            this.eersteKlasse.put(key, value);
            showInfo(reiziger, " is ingestapt in de eerste klasse.");

        } else if (reiziger.getKlasse() == 2){
            String key = reiziger.getName();
            Reiziger value = reiziger;
            this.tweedeKlasse.put(key, value);
            showInfo(reiziger, " is ingestapt in de tweede klasse.");
        } else {
            String key = reiziger.getName();
            Reiziger value = reiziger;
            this.wc.put(key, value);
            showInfo(reiziger, " is ingestapt. Hij rijdt zwart er zit verstopt op de wc.");
        }
    }

    public void controle(Reiziger reiziger){

        if (!reiziger.isTicket()){
            showInfo(reiziger, " is betrapt!");
            uitstappen(reiziger);
        } else {
            showInfo(reiziger, " heeft netjes een kaartje gekocht en mag verder reizen");
        }
    }

    public void uitstappen(Reiziger reiziger){

        if (reiziger.getKlasse() == 1){
            String key = reiziger.getName();
            Reiziger value = reiziger;
            this.tweedeKlasse.remove(key, value);
            showInfo(reiziger, " is uitgestapt uit de eerste klasse.");

        } else if (reiziger.getKlasse() == 2) {
            String key = reiziger.getName();
            Reiziger value = reiziger;
            this.tweedeKlasse.remove(key, value);
            showInfo(reiziger, " is uitgestapt uit de tweede klasse.");
        } else {
            String key = reiziger.getName();
            Reiziger value = reiziger;
            this.tweedeKlasse.remove(key, value);
            showInfo(reiziger, " is uit de wc gekomen en van de trein gezet.");
        }

    }

    public void showInfo(Reiziger reiziger, String actie){

            System.out.println(reiziger.getName()+ actie);

    }

    public void komtAan(Station station, Reiziger reiziger){
        if (reiziger.getBestemming() == station.getName() && reiziger.isTicket()){
            showInfo(reiziger, " is aangekomen op zijn bestemming");
            uitstappen(reiziger);
        }
    }

}


