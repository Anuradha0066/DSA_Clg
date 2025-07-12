package Leetcode;

//import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,4};
        int data=removeDuplicates(nums);
        System.out.println(data);
        
    }
     public static int removeDuplicates(int[] nums) {
        int it=1;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[i-1]){
               nums[it++]=nums[i];
           }
        }
        // for(int i=0;i<nums.length;i++){
        //    System.out.println(nums[i]);
        // }
        return it;

    }

}
