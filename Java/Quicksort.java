import java.util.Collections;
import java.util.Random;

/**
 * Created by aadithyavarma on 2/12/2018.
 */
public class Quicksort {
    public static void main(String[] args) {
        Comparable[] a = {26,4,5,3,1,2,10,11,22,21,34,25};
        //sort(a);
        System.out.println(select(a,10));

        //System.out.println(a.length);
        for(Comparable i : a){
            System.out.println(i);
        }
        //System.out.println(select(a,3-1));
    }


    // To compare two elements
    private static boolean less(Comparable a, Comparable b){
       return a.compareTo(b) < 0;
    }

    // To divide the array into two parts based on a partitioning element
    private static int partition(Comparable[] a, int low, int high){
        int i = low, j = high+1;
        while (true){
            while (less(a[++i],a[low])){
                if(i == high){break;}
            }
            while (less(a[low],a[--j])){
                if(j == low){break;}
            }
            if(i >= j){break;}
            Comparable temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
        Comparable temp = a[j];
        a[j] = a[low];
        a[low] = temp;

        return j;
    }

    // // Sort function that is called by user
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
    }

    // Sort function that we call with necessary parameters
    private static void sort(Comparable[] a, int low, int high){
        if (low < high){
            int j = partition(a,low,high);
            sort(a,low,j-1);
            sort(a,j+1,high);
        }
    }

    // Quick select function
    public static Comparable select(Comparable[] a, int pos){
        int low = 0, high = a.length-1;
        while (high > low){
            int i = partition(a,low,high);
            if(i < pos){
               low = i+1;
            }
            else if(i > pos){
                high = i-1;
            }
            else {
                return a[pos];
            }
        }
        return a[pos];
    }
}
