/**
 * Created by mhan on 3/1/2017.
 */
public class StringInterning {
    public static void main(String[] args){
        String fly  = "fly";  String weight  = "weight";
        String fly2 = "fly";  String weight2 = "weight";

        System.out.println(fly == fly2); //true
        System.out.println(weight == weight2); //true
        System.out.println(fly + weight == "flyweight"); //false

        String flyweight =  fly + weight ; //new String(fly + weight); //new String("flyweight");
        System.out.println(flyweight == "flyweight"); //false
        System.out.println(fly + weight == "flyweight"); //false

        String interned1 = (fly + weight).intern();
        String interned2 = flyweight.intern();
        System.out.println(interned1 == "flyweight");
        System.out.println(interned2 == "flyweight");
    }
}
