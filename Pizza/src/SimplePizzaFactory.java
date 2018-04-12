public class SimplePizzaFactory {

    public Pizza createPizza(String type){

        Pizza pizza = null;

        if (type.equals("cheese")){
            pizza = new CheesePizza();
            pizza.prepare();
        } else if (type.equals("veggie")){
            pizza = new VeggiePizza();
            pizza.prepare();
        }
        return pizza;

    }

}
