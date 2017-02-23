package pizzas;

public class PizzaStore {

	public Pizza orderPizza(String type) {
		Pizza pizza;

		if(type.equals("cheese")){
			pizza = new CheesePizza();
		} else if (type.equals("pepperoni")){
			pizza = new PepperoniPizza();
		} else {
			pizza = new ClamPizza();
		}
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

}
