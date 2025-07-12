package Practice_Question;

import java.util.Scanner;

public class Kth_Max_Min {
    public static void main(String[] args) {
        

    int[] arr={1,2,3,4,5,6};
     Scanner sc=new Scanner(System.in);
    System.out.println("Enter the term");
    int k=sc.nextInt();
   int Kth=Integer.MIN_VALUE;
    
    for(int i=0;i<Kth;i++){
        int max=Integer.MIN_VALUE;
        for(int j=0;j<arr.length;j++){
            if(arr[j]>max&&arr[j]<Kth){
                max=arr[j];
            }
        
          else if(i==0&& arr[j]>Kth){
            max=arr[i];
        }
         Kth=max;
    }
    }
   
    
    
    }
}
