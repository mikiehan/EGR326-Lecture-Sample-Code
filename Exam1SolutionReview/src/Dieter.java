/**
 * Created by mhan on 2/16/2017.
 */
public class Dieter implements Comparable<Dieter>{
    private String name;
    private int height; //inch
    private int weight; //pound

    public Dieter(String n, int h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    public String getName() { return name; }
    public int getWeight() { return weight; }
    public int getHeight() { return height; }

    public double getBMI() {
        return (double)height/(weight * weight);
    }

    @Override
    public int compareTo(Dieter other) {
        //First BMI
        double diffBMI= getBMI() - other.getBMI();
        if(diffBMI > 0)
            return 1;

        if (diffBMI < 0)
            return -1;

        //Second height
        if(height != other.height) {
            return height - other.height;
        }
        //Third name (alphabetical order)
        return name.compareTo(other.name);
    }
}

