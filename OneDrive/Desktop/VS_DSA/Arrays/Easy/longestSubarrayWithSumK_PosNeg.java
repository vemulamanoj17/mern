package Arrays.Easy;

public class longestSubarrayWithSumK_PosNeg {
    // public static int longest(int[] arr,int k){
    // //brute-o(n*2),o(1);
    //     int n=arr.length;
    //     int max=0;
    //     for(int i=0;i<n;i++){
    //         int sum=0;
    //         for(int j=i;j<n;j++){
    //             sum+=arr[j];
    //             if(sum==k){
    //                 max=Math.max(max,j-i+1);
    //             }
    //         }
    //     }
    //     return max;
    // }
    public static void main(String[] args) {
        int[] arr={10,5,2,-1,1,7,1,4};
        int k=15;
        System.out.print(longest(arr,k));
    }
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
