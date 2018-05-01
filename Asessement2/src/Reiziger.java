public class Reiziger {

    private String name;
    private boolean ticket;
    private int klasse;
    private String bestemming;

    public Reiziger(String name, boolean ticket, int klasse, String bestemming){

        this.name = name;
        this.ticket =  ticket;
        this.klasse = klasse;
        this.bestemming = bestemming;

    }

    public String getName() {
        return name;
    }

    public boolean isTicket() {
        return ticket;
    }

    public int getKlasse() {
        return klasse;
    }

    public String getBestemming() {
        return bestemming;
    }
}
