import java.util.*;

public class ChocolateController {
    public static void main(String args[]) {
        List<String> list = new LinkedList<>();

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println(boiler == boiler2);

    }
}