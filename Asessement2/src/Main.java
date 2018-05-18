public class Main {

    public static void main(String[] args) {

        Station arnemuiden = new Station("Arnemuiden");
        Station middelburg = new Station("Middelburg");
        Station vlissingenSouburg = new Station("Vlissingen-Souburg");
        Station vlissingen = new Station("Vlissingen");

        Wagon wagon = new Wagon(1);

        Reiziger thomas = new Reiziger("Thomas", true, 2, "Vlissingen");
        Reiziger shawn = new Reiziger("Shawn", true, 2, "Vlissingen");
        Reiziger jasper = new Reiziger("Jasper", true, 2, "Vlissingen");
        Reiziger sjaak = new Reiziger("Sjaak", true, 2, "Vlissingen");
        Reiziger jan = new Reiziger("Jan", true, 2, "Vlissingen");
        Reiziger piet = new Reiziger("Piet", true, 1, "Vlissingen");
        Reiziger henk = new Reiziger("Henk", false, 0, "Middelbrug");
        Reiziger john = new Reiziger("John", true, 2, "Vlissingen-Souburg");
        Reiziger jack = new Reiziger("Jack", true, 2, "Vlissingen-Souburg");
        Reiziger giorgio = new Reiziger("Giorgio", true, 1, "Vlissingen");

        System.out.println("");
        System.out.println("De trein vertrekt.");
        System.out.println("");

        wagon.instappen(thomas);
        wagon.instappen(shawn);
        wagon.instappen(jasper);
        wagon.instappen(sjaak);
        wagon.instappen(jan);
        wagon.instappen(piet);
        wagon.instappen(henk);

        System.out.println("");
        System.out.println("De conducteur komt de kaartjes controleren.");
        System.out.println("");

        wagon.controle(thomas);
        wagon.controle(shawn);
        wagon.controle(jasper);
        wagon.controle(sjaak);
        wagon.controle(jan);
        wagon.controle(piet);
        wagon.controle(henk);

        System.out.println("");
        System.out.println("De trein komt aan in Arnemuiden.");
        System.out.println("");

        wagon.komtAan(arnemuiden, thomas);
        wagon.komtAan(arnemuiden, shawn);
        wagon.komtAan(arnemuiden, jasper);
        wagon.komtAan(arnemuiden, sjaak);
        wagon.komtAan(arnemuiden, jan);
        wagon.komtAan(arnemuiden, piet);
        wagon.komtAan(arnemuiden, henk);

        wagon.instappen(jack);
        wagon.instappen(john);

        System.out.println("");
        System.out.println("De trein komt aan in Middelburg");
        System.out.println("");

        wagon.komtAan(middelburg, thomas);
        wagon.komtAan(middelburg, shawn);
        wagon.komtAan(middelburg, jasper);
        wagon.komtAan(middelburg, sjaak);
        wagon.komtAan(middelburg, jan);
        wagon.komtAan(middelburg, piet);
        wagon.komtAan(middelburg, henk);
        wagon.komtAan(middelburg, jack);
        wagon.komtAan(middelburg, john);

        wagon.instappen(giorgio);

        System.out.println("");
        System.out.println("De trein komt aan in Vlissingen-Souburg");
        System.out.println("");

        wagon.komtAan(vlissingenSouburg, thomas);
        wagon.komtAan(vlissingenSouburg, shawn);
        wagon.komtAan(vlissingenSouburg, jasper);
        wagon.komtAan(vlissingenSouburg, sjaak);
        wagon.komtAan(vlissingenSouburg, jan);
        wagon.komtAan(vlissingenSouburg, piet);
        wagon.komtAan(vlissingenSouburg, henk);
        wagon.komtAan(vlissingenSouburg, jack);
        wagon.komtAan(vlissingenSouburg, john);
        wagon.komtAan(vlissingenSouburg, giorgio);

        System.out.println("");
        System.out.println("De trein komt aan in Vlissingen");
        System.out.println("");

        wagon.komtAan(vlissingen, thomas);
        wagon.komtAan(vlissingen, shawn);
        wagon.komtAan(vlissingen, jasper);
        wagon.komtAan(vlissingen, sjaak);
        wagon.komtAan(vlissingen, jan);
        wagon.komtAan(vlissingen, piet);
        wagon.komtAan(vlissingen, henk);
        wagon.komtAan(vlissingen, jack);
        wagon.komtAan(vlissingen, john);
        wagon.komtAan(vlissingen, giorgio);

    }

}
