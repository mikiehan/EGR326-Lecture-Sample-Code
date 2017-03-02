package improvement2;

/*
 * Implement below code WITHOUT changing internal implementation of DinerMenu and PancakeHouseMenu
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Waitress {
	private List<Menu> menuList;

	public Waitress(List<Menu> menuList) {
		this.menuList = new ArrayList<>(menuList);
	}

	// prints ALL menus (both breakfast and lunch)
	public void printMenu() {
		// implement here
		for(Menu m : menuList) {
			printMenu(m.createIterator());
		}
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
		for(Menu m : menuList) {
			printVegetarianMenu(m.createIterator());
		}
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
		for(Menu m : menuList) {
			if (isItemVegetarian(m.createIterator(), name)) return true;
		}
		return false;
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
