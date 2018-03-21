import java.util.Stack;

/**
 * Created by aadithyavarma on 2/27/2018.
 */
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] a = {-2,-2,-2,-2,-2,-1};
        int current_max = a[0];
        int global_max = a[0];
        for(int i = 1; i < a.length; i++){
            current_max = Math.max(a[i],(a[i] + current_max));
            global_max = Math.max(global_max,current_max);
        }
        System.out.println(global_max);
    }
}
