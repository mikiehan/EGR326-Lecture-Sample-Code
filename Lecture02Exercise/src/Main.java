import java.util.HashSet;
import java.util.Set;
/*** Created by mhan on 1/17/2017. */
public class Main {

    public static void main(String[] args) {
        String s1 = new String("h");
        String s2 = new String("h");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s1));

        s1 = "h";
        s2 = "h";
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s1));
    }
}
