//package decorator;
//
//import decorator.coffee.Beverage;
//import decorator.coffee.DarkRoast;
//import decorator.coffee.Espresso;
//import decorator.coffee.HouseBlend;
//import decorator.condiments.Milk;
//import decorator.condiments.Mocha;
//import decorator.condiments.Soy;
//import decorator.condiments.Whip;
//
//public class StarbuzzCoffeeMain {
//
//	public static void main(String args[]) {
//		Beverage beverage = new Espresso();
//		System.out.println(beverage.getDescription()
//				+ " $" + beverage.cost());
//
//		Beverage beverage2 = new DarkRoast();
//		beverage2 = new Mocha(beverage2);
//		beverage2 = new Mocha(beverage2);
//		System.out.println(beverage2.getDescription()
//				+ " $" + beverage2.cost());
//
//		Beverage beverage3 = new HouseBlend();
//		beverage3 = new Mocha(beverage3);
//		beverage3 = new Milk(beverage3);
//		System.out.println(beverage3.getDescription()
//				+ " $" + beverage3.cost());
//	}
//}
