package Sliding_Window;

public class Negative_Count {
    public static void main(String[] args) {
        int[] arr={1,2,-2,-3,-3,4,5};
        int k=3;
        int count=0;

        for(int i=0;i<k;i++){
            if(arr[i]<0){
            count+=1;
            }
        }
        System.out.println(count);
      
        for(int i=k;i<arr.length;i++){
            if(arr[i]<0){
                count++;
            }
            else if(arr[i-k]<0){
                count--;
            }
             System.out.println(count);
        }
       
    }
}
