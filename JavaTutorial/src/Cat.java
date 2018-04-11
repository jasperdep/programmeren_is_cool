public class Cat extends Animal {

    public Cat(){



    }

    public String makeSound(){

        return "Moew";

    }

    public static void main(String[] args) {

        Animal Shawn = new Dog();
        Animal Thomas = new Cat();

        Animal[] theAnimals = new Animal[10];

        theAnimals[0] = Shawn;
        theAnimals[1] = Thomas;

        System.out.println("Shawn says " + theAnimals[0].makeSound());
        System.out.println("Thomas says " + theAnimals[1].makeSound());

    }

}
