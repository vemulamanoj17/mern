package Arrays.Easy;

public class maxConsecutiveOnes {
    public static int maxones(int[] arr){
        int max=0,count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
            }else if(arr[i]!=1){
                max=Math.max(max,count);
                count=0;
            }
        }
        max=Math.max(max,count);
        return max;
    }
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,0,0,1,1,1,1,1,1,1};
        System.out.print(maxones(arr));
    }
}
