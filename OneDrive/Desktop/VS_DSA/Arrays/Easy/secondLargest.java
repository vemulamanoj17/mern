package Arrays.Easy;

public class secondLargest {
    // public static void main(String[] args) {
    //     int[] arr={3,3};
    //     int max=Integer.MIN_VALUE;
    //     int max2=Integer.MIN_VALUE;
    //     for(int ele:arr){
    //         max=Math.max(max,ele);
    //     }
    //     for(int i=0;i<arr.length;i++){
    //         if(max2<arr[i]&&arr[i]!=max){
    //             max2=arr[i];
    //         }
    //     }
    //     max2=(max2==Integer.MIN_VALUE)?-1:max2;
    //     System.out.print(max2);
    // }
    
    public static void main(String[] args){
        int[] arr={1,1,1,1,1};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MAX_VALUE;
        for(int ele:arr){
            if(max1<ele){
                max2=max1;
                max1=ele;
            }else if(ele<max1&&ele>max2){
                max2=ele;
            }
        }
        max2=(max2==Integer.MIN_VALUE)?-1:max2;
        System.out.print(max2);
    }
}
