/**
 * Created by aadithyavarma on 2/23/2018.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,5,6,7,8,9,9,10,11,12,13,15,18};
        //search(a,5);
        System.out.println("Element is present at " + rec(a,5,0,a.length-1,-1,false));
    }


    // Recursive way of binary search
    private static int rec(int[] a, int x,int low, int high, int result, boolean flag){
        if(high >= low){
            int mid = low + (high - low)/2;
            if(x < a[mid]){
                return rec(a,x,low,mid-1,result,flag);
            }
            else if(x > a[mid]){
                return rec(a,x,mid+1,high,result,flag);
            }
            else if (x == a[mid]){
                result = mid;
                if(flag){
                    return rec(a,x,low,mid-1,result,flag);
                }
                else{
                    return rec(a,x,mid+1,high,result,flag);
                }
            }
        }
        return result;
    }

    // Non recursive way of binary search
    private static int search(int[] a, int element, int result, boolean flag) {
        int low = 0, high = a.length-1;
        result = -1;
        while(high >= low){
            int mid = low + (high - low)/2;
            if(element < a[mid]){
                high = mid - 1;
            }
            else if(element > a[mid]){
                low = mid + 1;
            }
            else{
                result = mid;
                if(flag){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
        }
        return result;
    }
}
