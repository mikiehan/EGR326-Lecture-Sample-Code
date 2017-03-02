//Uncomment this file after finishing implementing flyweighted Date class
//import java.util.*;
//
//// This client program uses the flyweighted Date class.
//// It demonstrates how many (how few) objects are constructed.
//public class DateMain {
//    private static final int OBJECT_COUNT = 100000;
//
//    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//
//        Random r = new Random();
//        for (int i = 0; i < OBJECT_COUNT; i++) {
//            int month = r.nextInt(12) + 1;
//            int day = r.nextInt(28) + 1;
//            Date date = Date.getInstance(month, day);
//        }
//
//        long endTime = System.currentTimeMillis();
//        long elapsed = endTime - startTime;
//        System.out.println("took " + elapsed + " ms");
//        System.out.println(Date.getObjectCount() + " unique objects created.");
//    }
//}
//
