package imp1;

/*
 * Implement below code WITHOUT changing internal implementation of DinerMenu and PancakeHouseMenu
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
        printMenu(pancakeHouseMenu.createIterator());
        printMenu(dinerMenu.createIterator());
    }

    // prints just all types of menu
    private void printMenu(Iterator iterator) {
        while(iterator.hasNext())
            System.out.println(iterator.next());
    }

    // prints all vegetarian menu from both breakfast and lunch
    public void printVegetarianMenu() {
        //implement here
        printVegetarianMenu(pancakeHouseMenu.createIterator());
        printVegetarianMenu(dinerMenu.createIterator());
    }

    private void printVegetarianMenu(Iterator iterator){
        while(iterator.hasNext()) {
            MenuItem o = (MenuItem) iterator.next();
            if(o.isVegetarian()) {
                System.out.println(o);
            }
        }
    }


    // returns a particular name menu is vegetarian or not
    public boolean isItemVegetarian(String name) {
        //implement here
        ArrayList breakfastMenuArrayList = pancakeHouseMenu.getMenuItems();
        for(Object o : breakfastMenuArrayList) {
            MenuItem oneMenu = (MenuItem) o;
            if(oneMenu.getName().equals(name) && oneMenu.isVegetarian())
                return true;
        }

        MenuItem[] lunchMenuArray = dinerMenu.getMenuItems();
        for(MenuItem oneMenu : lunchMenuArray) {
            if(oneMenu.getName().equals(name) && oneMenu.isVegetarian())
                return true;
        }
        return false;
    }
}