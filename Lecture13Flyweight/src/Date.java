// Make this Data class a flyweight
public class Date {
    private int month;
    private int day;

    public Date(int m, int d) {
        month = m;
        day = d;
    }

    public static Date getInstance(int m, int d){
        //implement your code here
        return null; //overwrite this code
    }

    public static int getObjectCount(){
        //implement your code here
        return -1; //overwrite this code
    }
}
