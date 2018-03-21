/**
 * Created by aadithyavarma on 3/21/2018.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] a = {2,3,4,1,5,7,4};
        int pos = search(44,a);
        if(pos != -1){
            System.out.println("The element is present at position: "+pos);
        }
        else{
            System.out.println("Element not present");
        }
    }
    // Search function
    private static int search(int element, int[] a){
        for(int i = 0; i < a.length; i++){
            if(a[i] == element){
                return i;
            }
        }
        return -1;
    }
}
