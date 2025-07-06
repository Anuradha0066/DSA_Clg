package String;

public class firstRepeating {
    public static void main(String[] args) {
        String str="hebblopo";
        boolean found=false;
         for(int i=0;i<str.length();i++){
            for(int j= i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(i));
                    found=true;
                    break;
                }
            }
             if(found){
        break;}
       }
      
       
    }
}
