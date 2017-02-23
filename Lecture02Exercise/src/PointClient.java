/**
 * Created by mhan on 1/26/2017.
 */
public class PointClient {
    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        Point p2 = p1.clone();
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.getClass() == p2.getClass());
    }
}

