package Arrays.Easy;

public class missingNumber {
    public static int missing(int[] arr){
        int n=arr.length;
        int total=(n*(n+1))/2;
        int mul=0;
        for(int ele:arr){
            mul=mul+ele;
        }
        return total-mul;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,0};
        int value=missing(arr);
        System.out.print(value);
    }
}
