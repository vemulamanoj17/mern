package Arrays.Easy;

public class arraySortedOrNot {
    public static boolean checksorted(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>arr[(i+1)%n])count++;
        }
        if(count<=1)return true;
        return false;
    }
    public static void main(String[] args) {
        int[] arr={6,9,1,2,3,4,5};
        boolean ans=checksorted(arr);
        System.out.print(ans);
    }
}
