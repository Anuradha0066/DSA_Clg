package String;

import java.util.Arrays;

public class string {
    public static void main(String[] args) {
        String str="hello";
        // for(int i=0;i<str.length();i++){
        //     System.out.println(str.charAt(i));
        // }
        // System.out.println();
        //  for(int i=str.length()-1;i>=0;i--){
        //     System.out.println(str.charAt(i));
        // }
        String res="";
       for(char i=0;i<str.length();i++){
        char ch=str.charAt(i);
        if(res.indexOf(ch)==-1){
            res+=ch;
        }
       }
       System.out.println(res);
    }
}
