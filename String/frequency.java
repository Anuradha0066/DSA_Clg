package String;

import java.util.HashMap;
import java.util.Map;

public class frequency {
    public static void main(String[] args) {
        String str="hello world";

        HashMap<Character,Integer> freqMap=new HashMap<>();

        // str.toCharArray();
        // for(int i=0;i<str.length();i++){
        //     char ch=str.charAt(i);
        // }
        for(char ch:str.toCharArray() ){
              // if(ch == ' ')continue;

              if(freqMap.containsKey(ch)){
                freqMap.put(ch,freqMap.get(ch)+1 );
              }
              else{
                freqMap.put(ch, 1);
              }

            
        }
 
    //     for(char key:freqMap.keySet()){
    //    System.out.println(key +" = "+ freqMap.get(key));
    // }
        for(Map.Entry<Character,Integer> entry:freqMap.entrySet()){
            System.out.println("character: "+entry.getKey()+"="+entry.getValue());

        }

    }
}
