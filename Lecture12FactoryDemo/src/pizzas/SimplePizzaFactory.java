package pizzas;

/**
 * Created by mhan on 2/28/2017.
 */
public class SimplePizzaFactory {

    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else {
            pizza = new VeggiePizza();
        }
        return pizza;
    }
}
