package Sliding_Window;

public class PostfixSum {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6,7};
         int[] arr1= new int[arr.length];

       arr1[arr1.length-1]=arr[arr.length-1];
         for(int i=0;i<arr.length-1;i++){
            arr1[i]=arr[i]+arr[i+1];
         }
       for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]);
       }
    }
}
