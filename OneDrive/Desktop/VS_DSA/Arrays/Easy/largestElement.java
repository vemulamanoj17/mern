package Arrays.Easy;
import java.util.*;
public class largestElement {
    // public static void main(String[] args) {
    //o(n)
    //     int[] arr={3,3,6,1};
    // int max=Integer.MIN_VALUE;
    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]>max){
    //         max=arr[i];
    //     }
    // }
    // System.out.println(max);
    // }
    public static void main(String[] args) {
        //o(nlogn)
        int[] arr={3,3,6,1};
        Arrays.sort(arr);
        System.out.print(arr[arr.length-1]);
    }
}
