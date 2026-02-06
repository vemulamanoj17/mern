package Arrays.Easy;
import java.util.*;
public class leftRotateArrayByD_Places {
    // public static void rotate(int[] arr,int d){
    //     d=d%arr.length;
    //     int n=arr.length;
    //     int[] temp=new int[n];
    //     for(int i=0;i<d;i++){
    //         temp[i]=arr[n-d+i];
    //     }
    //     for(int i=0;i<n-d;i++){
    //         temp[i+d]=arr[i];
    //     }
    //     for(int i=0;i<n;i++){
    //         arr[i]=temp[i];
    //     }
    // }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void rotate(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        reverse(arr,0,n-1);
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=3;
        rotate(arr,d);
        System.out.print(Arrays.toString(arr));
    }
}
