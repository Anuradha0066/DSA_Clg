package Sliding_Window;

public class EvenCount {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        int count=0;
       
        for(int i=0;i<k;i++){
            if(arr[i]%2==0){
                count++;
            }  
        }
        System.out.println(count);

        for(int i=k;i<arr.length;i++){
            if(arr[i]%2==0){
                count++;
            }
            else if(arr[i-k]%2==0){
                count--;
            }
            System.out.println(count);
        }
    }
}
