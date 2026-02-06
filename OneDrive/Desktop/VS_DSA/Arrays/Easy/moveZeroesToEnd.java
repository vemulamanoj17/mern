package Arrays.Easy;
import java.util.*;
public class moveZeroesToEnd {
    public static void movetoend(int[] arr){
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=j;i<n;i++){
            arr[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,2,3,0,4};
        movetoend(arr);
        System.out.print(Arrays.toString(arr));
    }
}
