package initialstate;

/*
 * Implement below code WIHOUT changing internal implementation of DinerMenu and PancakeHouseMenu
 */

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
	
	// prints ALL menus (both breakfast and lunch)
	public void printMenu() {
		// implement here
	}

	// prints just breakfast menu
	public void printBreakfastMenu() { 
		// implement here
	}
 
	// prints just lunch menu
	public void printLunchMenu() {
		// implement here
	}
	

	// prints all vegetarian menu from both breakfast and lunch
	public void printVegetarianMenu() {
		//implement here
	}
 
	// returns a particular name menu is vegetarian or not
	public boolean isItemVegetarian(String name) {
		//implement here
		return false;
	}
}
