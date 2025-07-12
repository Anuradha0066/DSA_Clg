package Sliding_Window;

public class PrefixSum {
    public static void main(String[] args) {
         int[] arr={1,2,3,4,5,6,7};
         int[] arr1= new int[arr.length];

         System.out.println(arr[0]);
         for(int i=1;i<arr.length;i++){
            arr1[i]=arr[i]+arr[i-1];
         }
       for(int i=1;i<arr1.length;i++){
        System.out.println(arr1[i]);
       }
    
    }
}
