package Array_2D;

import java.util.Arrays;

public class Median {
    public static void main(String[] args) {
        int nums1[]={2,3,4};
        int nums2[]={5,6,7};
      
       double data= findMedianSortedArrays(nums1, nums2);
       System.out.println(data);
       
    }

   public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,res,0,nums1.length);
        System.arraycopy(nums2,0,res,nums1.length,nums2.length);
        
        Arrays.sort(res);
         
        int n=res.length;

      if(n%2==0){
        return (res[n/2-1]+res[n/2])/2.0;
          
       
      }
      else{
    return res[n/2];
      }
    }
}
