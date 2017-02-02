import java.util.Scanner;

/**
 * Created by mhan on 1/17/2017.
 */
public class Point implements Cloneable {
    private int x;
    private int y;

    @Override
    public Point clone() {
        try {
            return (Point) super.clone();
        }catch(CloneNotSupportedException e){
            return null; //will never ever reach here
        }
    }

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = 37 * result + x;
        result = 37 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {

        //if you want less strict version allowing child classes to type cast as well
        //you can use below commented code instead
        ////if (obj instanceof Point){
        if (obj!= null && this.getClass() == obj.getClass()){
            Point other = (Point) obj;
            return (x == other.x && y == other.y);
        } else {
            return false;
        }
    }
}
