package improvement2;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {
	public static void main(String args[]) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
		List<Menu> mList = new ArrayList<>();
		mList.add(pancakeHouseMenu);
		mList.add(dinerMenu);
		Waitress waitress = new Waitress(mList);
		waitress.printMenu();
		waitress.printVegetarianMenu();
	}
}
