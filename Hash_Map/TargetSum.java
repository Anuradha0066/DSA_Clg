package Hash_Map;

import java.util.HashMap;
import java.util.HashSet;

public class TargetSum {
    public static void main(String[] args) {
         


        // HashMap<Integer,Integer> map=new HashMap<>();

        // int[] arr={1,2,3,4,5};
        // int target=3;
        
        // for(int i=0;i<arr.length;i++){
        //     int value=target-arr[i];
        //     if(map.containsKey(value)){
        //         System.out.println(value+"+"+arr[i]+"="+target);
        //       System.out.println(map.get(value)+" "+i);
        //     }
        //    map.put(arr[i], i);
        // }


        int[] arr={1,2,3,4,5};
         int target=3;

        
       int[] res=TwoSum(arr, target);
       System.out.println(res[0]+" "+res[1]);

    }

    private static char[] ArraytoString() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ArraytoString'");
    }

    static int[] TwoSum(int[] arr,int target){

           for(int i=0;i<arr.length;i++){
        int temp=target -arr[i];
        for(int j=0;j<arr.length;j++){
            if(temp==arr[j]){
              return  new int[] {i,j};
            }
        }
        
     }
     return new int[]{};
    }
    
}
