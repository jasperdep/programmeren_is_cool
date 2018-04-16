public class Buschauffeur {

    private String name;

    public Buschauffeur(String name) {

        this.name = name;

    }

    public boolean zijnGelijk(Hond hond, Kat kat) {

        return hond.equals(kat);

    }

    public boolean zijnGelijk(Hond hond, Hond hond2) {

        return (hond == hond2);

    }

}
