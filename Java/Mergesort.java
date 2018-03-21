/**
 * Created by aadithyavarma on 2/14/2018.
 */
public class Mergesort {
    public static void main(String[] args) {
        Comparable[] a = {"aadi","sangeeth","raj","amol","lokesh"};
        sort(a);
        for (Comparable i : a){
            System.out.println(i);
        }
    }

    // To compare two elements
    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }

    // Merging two arrays
    private static void merge(Comparable[] a, Comparable[] aux, int low, int mid, int high){
        for (int k = low; k <= high; k++) {
            aux[k] = a[k];
        }
        int i = low, j = mid+1;
        for (int k = low; k <= high; k++) {
            if(i > mid){
                a[k] = aux[j++];
            }
            else if(j > high){
                a[k] = aux[i++];
            }
            else if(less(aux[i],aux[j])){
                a[k] = aux[i++];
            }
            else {
                a[k] = aux[j++];
            }
        }
    }

    // Sort function that is called by user
    private static void sort(Comparable[] a){
        Comparable[] aux = new Comparable[a.length];
        sort(a,aux,0,a.length-1);
    }

    // Sort function that we call with necessary parameters
    private static void sort(Comparable[] a, Comparable[] aux, int low, int high){
        if (high > low) {
            int mid = low + (high - low) / 2;
            sort(a, aux, low, mid);
            sort(a, aux, mid+1 , high);
            merge(a, aux, low, mid, high);
        }
    }
}
