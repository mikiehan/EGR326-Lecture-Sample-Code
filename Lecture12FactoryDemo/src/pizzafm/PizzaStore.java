package pizzafm;
//Change this class
public class PizzaStore {
 
	public Pizza orderPizza(String type) {
		Pizza pizza = new NYStyleCheesePizza(); //just a placeholder
		System.out.println("--- Making a " + pizza.getName() + " ---");
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
