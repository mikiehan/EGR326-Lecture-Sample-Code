/**
 * Created by mhan on 2/16/2017.
 */
public class BinarySearch {
    //pre: sorted
    //post: return the index of the target found in dieters array
    //      return -1 not found
    //Use iteration
    public static int binarySearch(Dieter[] dieters, Dieter target){
        int min = 0;
        int max = dieters.length - 1;

        while(min <= max) {
            int mid = (min + max)/2;
            if (dieters[mid].compareTo(target) == 0){
                return mid; //found
            } else if(dieters[mid].compareTo(target) > 0) {
                max = mid -1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }

    //Use recursion
    public static int binarySearch2(Dieter[] dieters, Dieter target) {
        return binarySearchHelper(dieters, target, 0 , dieters.length - 1);
    }

    public static int binarySearchHelper(Dieter[] dieters,
                                         Dieter target,
                                         int min, int max) {
        //sad base case
        if(min > max)
            return -1;

        int mid = (min + max) / 2;//happy base case
        if( dieters[mid].compareTo(target) == 0 )
            return mid;

        if(dieters[mid].compareTo(target) > 0)
            return binarySearchHelper(dieters, target, min , mid - 1);
        else
            return binarySearchHelper(dieters, target, mid + 1 , max);

    }
}
