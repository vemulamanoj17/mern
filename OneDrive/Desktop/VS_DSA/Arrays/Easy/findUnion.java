package Arrays.Easy;
import java.util.*;
public class findUnion {
    // public static int[] unionn(int[] arr1,int[] arr2){
    //     Set<Integer>set1=new HashSet<>();
    //     for(int ele:arr1){
    //         set1.add(ele);
    //     }
    //     for(int ele:arr2){
    //         set1.add(ele);
    //     }
    //     int[] temp=new int[set1.size()];
    //     int index=0;
    //     for(int x:set1){
    //         temp[index++]=x;
    //     }
    //     return temp;
    // }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        int[] arr2={3,8,10};
        int[] temp=unionn(arr,arr2);
        System.out.print(Arrays.toString(temp));
    }
    public static int[] unionn(int[] arr1,int[] arr2){
        int m=arr1.length;
        int n=arr2.length;
        int i=0,j=0;
        Integer prev=null;
        ArrayList<Integer>al=new ArrayList<>();
        while (i<m&&j<n) {
            int val=-1;
            if(arr1[i]<arr2[j]){
                val=arr1[i];
                i++;
            }else if(arr1[i]>arr2[j]){
                val=arr2[j];
                j++;
            }else{
                val=arr1[i];
                i++;
                j++;
            }
            if(prev==null||prev!=val){
                al.add(val);
                prev=val;
            }
        }
        while(i<m){
            if(prev==null||arr1[i]!=prev){
                al.add(arr1[i]);
                prev=arr1[i];
                i++;
            }
        }
        while(j<n){
            if(prev==null||arr2[j]!=prev){
                al.add(arr2[j]);
                prev=arr2[j];
                j++;
            }
        }
        int[] temp=new int[al.size()];
        int index=0;
        for(int ele:al){
            temp[index++]=ele;
        }
        return temp;
    }
}
