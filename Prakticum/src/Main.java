public class Main {

    public static void main(String[] args) {

        Buschauffeur buschauffeur = new Buschauffeur("Andries");
        Hond thomas = new Hond();

        Hond shawn = new Hond();
        Kat henk = new Kat();

        System.out.println(buschauffeur.zijnGelijk(thomas, henk));

        Bus bus = new Bus(buschauffeur);

        //bushalte 1
        Schoolkind kwik = new Schoolkind("kwik");
        Schoolkind kwek = new Schoolkind("kwek");
        Schoolkind kwak = new Schoolkind("kwak");

        bus.instappen(kwik, kwek, kwak);
        System.out.println(bus);

        //bushalte 2
        Schoolkind rimmert = new Schoolkind("Rimmert");
        bus.instappen(rimmert);
        System.out.println(bus);

        OudeMeneer dagobert = new OudeMeneer("Dagobert");
        bus.instappen(dagobert);
        System.out.println(bus);

        //controlepost
        Mens uitgestapte = bus.uistappen("kwik");
        System.out.println(bus);

    }

}
