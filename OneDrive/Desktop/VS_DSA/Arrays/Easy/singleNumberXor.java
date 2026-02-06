package Arrays.Easy;

public class singleNumberXor {
    public static int single(int[] arr){
        int xor=0;
        for(int ele:arr){
            xor=xor^ele;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,4,4,5,5};
        System.out.print(single(arr));
    }
}
