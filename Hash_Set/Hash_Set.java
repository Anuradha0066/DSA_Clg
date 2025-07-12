package Hash_Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Hash_Set {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        TreeSet<Integer> data=new TreeSet<>();
        data.add(2);
        data.add(3);
        set.add("hello");
        set.add("hiii");
        set.add("hello");
       
       System.out.println( data.contains(2));
       data.remove(2);
       System.out.println(data);
        System.out.println(set);
    }
}
