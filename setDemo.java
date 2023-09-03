import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class setDemo {
    // public static void main(String args[]){
    //     Collection<Integer> nums = new TreeSet<Integer>();
    //     nums.add(22);
    //     nums.add(32);
    //     nums.add(42);
    //     nums.add(12);
    //     nums.add(20);

    //     Iterator<Integer> values = nums.iterator();
    //     while (values.hasNext()) {
    //         System.out.println(values.next());
            
    //     }
    // }

        public static void main(String args[]){
        Collection<Integer> nums = new HashSet<Integer>();
        nums.add(22);
        nums.add(32);
        nums.add(42);
        nums.add(12);
        nums.add(20);

        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
            
        }
    }
}
