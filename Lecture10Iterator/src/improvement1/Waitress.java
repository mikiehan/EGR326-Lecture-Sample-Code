package improvement1;

/*
 * Implement below code WIHOUT changing internal implementation of DinerMenu and PancakeHouseMenu
 */

import java.util.ArrayList;

public class Waitress {
	private PancakeHouseMenu pancakeHouseMenu;
	private DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	// prints ALL menus (both breakfast and lunch)
	public void printMenu() {
		// implement here
		printMenu(this.pancakeHouseMenu.createIterator());
		printMenu(this.dinerMenu.createIterator());
	}

	// takes care of printing given the iterator
	public void printMenu(Iterator iter) {
		// implement here
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	// prints all vegetarian menu from both breakfast and lunch
	public void printVegetarianMenu() {
		printVegetarianMenu(this.pancakeHouseMenu.createIterator());
		printVegetarianMenu(this.dinerMenu.createIterator());
	}

	private void printVegetarianMenu(Iterator iter){
		while(iter.hasNext()) {
			MenuItem m = (MenuItem) iter.next();
			if(m.isVegetarian())
				System.out.println(m);
		}
	}

	// returns a particular name menu is vegetarian or not
	public boolean isItemVegetarian(String name) {
		if(isItemVegetarian(this.pancakeHouseMenu.createIterator(), name)) return true;
		return isItemVegetarian(this.dinerMenu.createIterator(), name);
	}

	private boolean isItemVegetarian(Iterator iter, String name){
		while(iter.hasNext()) {
			MenuItem oneMenu = (MenuItem) iter.next();
			if(oneMenu.getName().equals(name) && oneMenu.isVegetarian())
				return true;
		}
		return false;
	}
}
