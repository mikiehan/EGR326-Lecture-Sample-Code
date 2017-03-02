/**
 * Created by mhan on 2/9/2017.
 */
public class ChocolateBoiler {
    private volatile static ChocolateBoiler uniqueInstance;
    private boolean boiled;
    private boolean empty;

    private ChocolateBoiler(){
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if(uniqueInstance == null) {
            synchronized (ChocolateBoiler.class) {
                if(uniqueInstance == null)
                    uniqueInstance = new ChocolateBoiler();
            }
        }
        return uniqueInstance;
    }

    public void fill(){
        if(!empty) {
            empty = false;
            boiled = false;
        }
    }

    public void boil(){
        if(!empty && !boiled) {
            boiled = true;
        }
    }

    public void drain(){
        if(!empty && boiled) {
            empty = true;
        }
    }

}