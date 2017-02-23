import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by mhan on 1/24/2017.
 */
public class ExampleCheckedEx {

    public static void main (String[] args) throws FileNotFoundException {
//        int n = 0;
//        System.out.println(100/n);
        //try {
            exampleException();
//        }catch(FileNotFoundException e){
//
//        }
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void exampleException() throws FileNotFoundException{
            Scanner input = new Scanner(new File("some file"));
    }
}
