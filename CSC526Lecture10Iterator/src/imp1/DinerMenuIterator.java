package imp1;

/**
 * Created by mhan on 3/7/2017.
 */
public class DinerMenuIterator implements Iterator {
    private MenuItem[] menuItems;
    private int index;

    public DinerMenuIterator(MenuItem[] menuItems){
        this.menuItems = menuItems;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < menuItems.length;
    }

    @Override
    public Object next() {
        return menuItems[index++];
    }
}
