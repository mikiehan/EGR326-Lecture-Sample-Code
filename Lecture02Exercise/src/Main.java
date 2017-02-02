import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/*** Created by mhan on 1/17/2017. */
public class Main {

    public static void main(String[] args) {
        Point p = new Point(3,4);
        Point p2 = new Point(3,4);
        Point p3 = new Point (5,6);
        Set<Point> set = new HashSet<>();
        set.add(p); // p.hashCode() //I added (3,4)

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        System.out.println(set.contains(p)); // hey do you have (3,4)?
        System.out.println(set.contains(p2));// hey do you have (3,4)? --> true

        p.translate(2, 2); //5, 6
        System.out.println(set.contains(p)); //hey do you have (5,6)?  --> false;
        System.out.println(set.contains(p3));  //hey do you have (5,6)? --> false

        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());

        //        Point p1 = new Point (5,3);
//        Point p2 = new Point (5,3);
//        Point p3 = p2;
//
//        System.out.println("p1 == p2 : " + (p1 == p2));
//        System.out.println("p1 == p3 : " + (p1 == p3));
//        System.out.println("p3 == p2 : " + (p3 == p2));
//
//        System.out.println("p1.equals(p2) : " + p1.equals(p2));
//        System.out.println("p1.equals(p3) : " + p1.equals(p3));
//        System.out.println("p3.equals(p2) : " + p3.equals(p2));

    }
}

