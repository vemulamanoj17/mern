package Arrays.Easy;
import java.util.*;
public class removeDuplicates {
    public static void removedup(int[] arr){
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        System.out.println(i+1);
    }
    public static void main(String[] args) {
        int[] arr={1,1,1,1,2,3,3,4,5,5,6,6,6,7};
        removedup(arr);
        System.out.print(Arrays.toString(arr));
        
    }
}