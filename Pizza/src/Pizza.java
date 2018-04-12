abstract class Pizza {

    void prepare(){

        add();
        bake();
        cut();
        box();

    }

    abstract void add();


    public void bake(){

        System.out.println("The pizza is in the oven");

    }

    public void cut(){

        System.out.println("They are cutting the pizza");

    }

    public void box(){

        System.out.println("The pizza is in the box");

    }

}
