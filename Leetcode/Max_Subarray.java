package Leetcode;

public class Max_Subarray{
    
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
       int data= Max(nums);
       System.out.println(data);
        
    }

    public static int Max(int[] nums){
    //    int max=Integer.MIN_VALUE;
    //    int k=3;
    //    int windowSum=0;

    //    for(int i=0;i<k;i++){
    //     windowSum+=nums[i];
    //    }
       

    //    for(int i=k;i<nums.length;i++){
    //     windowSum += nums[i]-nums[i-k];
    //      max= Math.max(max,windowSum);
    //    }



    //    for(int i=0;i<=nums.length-k;i++){
    //     int currentSum=0;
       
    //     for(int j=i;j<i+k;j++){
    //         currentSum += nums[j];
    //         max= Math.max(max,currentSum);
          
    //     }
       //}

       //return max;

       int max=nums[0];
       int currentSum=0;

       for(int num:nums){
        currentSum=Math.max(num, currentSum+num);
        max=Math.max(max, currentSum);
       }
       return max;
    }
}
