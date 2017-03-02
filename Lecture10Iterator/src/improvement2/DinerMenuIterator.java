package improvement2;

import java.util.Iterator;

/**
 * Created by mhan on 2/16/2017.
 */
public class DinerMenuIterator implements Iterator {
    //define your field
    private MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        //fill this code
        this.menuItems = menuItems;
        this.position = 0;
    }

    @Override
    public void remove() {
        //implement your code here
        for(int i = position; i < menuItems.length - 1 ; i++) {
            if(menuItems[i] == null) return;

            menuItems[i] = menuItems[i+1];
        }
    }

    @Override
    public boolean hasNext() {
        return (position < menuItems.length && menuItems[position] != null);
    }

    @Override
    public Object next() {
        return menuItems[position++];
    }
}
