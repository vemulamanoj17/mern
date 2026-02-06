package Arrays.Easy;
public class longestSubarrayWithSumK_Pos {
    // public static int longest(int[] arr,int k){
    //brute-o(n*2),o(1);
    //     int n=arr.length;
    //     int max=0;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum+=arr[j];
    //             if(sum==k){
    //                 max=Math.max(max,j-i+1);
    //                 break;
    //             }
    //         }
    //     }
    //     return max;
    // }
    public static void main(String[] args) {
        int[] arr={10, 5,0, 2, 7, 1, 9};
        int k=15;
        System.out.print(longest(arr,k));
    }
    // public static int longest(int[] arr,int k){
    //     //better orderedmap:o(nlogn),unordered:best-o(n),worst-o(n*2); sc:o(n);
    //     Map<Integer,Integer>map=new HashMap<>();
    //     int max=0,sum=0;
    //     int n=arr.length;

    //     for(int i=0;i<n;i++){
    //         sum+=arr[i];
    //         if(sum==k){
    //             max=Math.max(max,i+1);
    //         }
    //         int rem=sum-k;
    //         if(map.containsKey(rem)){
    //             max=Math.max(max,i-map.get(rem));
    //         }
    //         if(!map.containsKey(sum)){
    //             map.put(sum,i);
    //         }
    //     }
    //     return max;
    // }
    public static int longest(int[] arr,int k){
        //o(n),o(1);
        int n=arr.length;
        int left=0;
        int sum=0;
        int max=0;
        for(int right=0;right<n;right++){
            sum+=arr[right];
            if(sum==k){
                max=Math.max(max,right-left+1);
            }
            while (sum>k) {
                sum-=arr[left];
                left++;
            }
        }
        return max;
    }
}
