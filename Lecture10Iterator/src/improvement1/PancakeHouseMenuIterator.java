package improvement1;

import java.util.ArrayList;

/**
 * Created by mhan on 2/16/2017.
 */
public class PancakeHouseMenuIterator implements Iterator{
    //define your field
    private ArrayList menuItems;
    private int position;
    public PancakeHouseMenuIterator(ArrayList menuItems) {
        //fill this method
        this.menuItems = menuItems;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }

    @Override
    public Object next() {
        return menuItems.get(position++);
    }
}
