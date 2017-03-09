package imp1;

import java.util.ArrayList;

/**
 * Created by mhan on 3/7/2017.
 */
public class PancakeHouseMenuIterator implements Iterator {
    private ArrayList menuItems;
    private int index;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.size();
    }

    @Override
    public Object next() {
        return menuItems.get(index++);
    }
}
