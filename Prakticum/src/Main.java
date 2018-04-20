public class Main {

    public static void main(String[] args) {

        Buschauffeur buschauffeur = new Buschauffeur("Andries");
        Hond thomas = new Hond("Thomas");

        Hond shawn = new Hond("Shawn");
        Kat henk = new Kat();

        System.out.println(buschauffeur.zijnGelijk(thomas, henk));

        Bus bus = new Bus(buschauffeur);

        //bushalte 1
        Schoolkind kwik = new Schoolkind("kwik");
        Schoolkind kwek = new Schoolkind("kwek");
        Schoolkind kwak = new Schoolkind("kwak");

        bus.instappen(kwik, kwek, kwak);
        bus.info();

        //bushalte 2
        Schoolkind rimmert = new Schoolkind("Rimmert");
        bus.instappen(rimmert);
        bus.info();

        OudeMeneer dagobert = new OudeMeneer("Dagobert");
        bus.instappen(dagobert);
        bus.info();

        //controlepost
        Nameable uitgestapte = bus.uitstappen("kwik");
        bus.info();

        //hond stapt in de bus
        Hond loebas = new Hond("Loebas");
        bus.instappen(loebas);
        bus.info();

        BusStation vlissingen = new BusStation();
        vlissingen.rijdtBinnen(bus);

    }

}
