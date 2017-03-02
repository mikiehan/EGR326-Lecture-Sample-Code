package improvement1;

/**
 * Created by mhan on 2/16/2017.
 */
public class DinerMenuIterator implements Iterator{
    //define your field
    private MenuItem[] menuItems;
    private int position;

    public DinerMenuIterator(MenuItem[] menuItems) {
        //fill this code
        this.menuItems = menuItems;
        this.position = 0;
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
