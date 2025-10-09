import java.util.Arrays;
import java.util.List;

public class CollectionPractise {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(12,3,4,4,5,6,7,534);
        System.out.println("size() = "+l1.size());
        System.out.println("get()="+l1.get(3));
        // l1.remove(5);
        System.out.println("after removing 3rd element " +l1);
        System.out.println("isEmpty() " + l1.isEmpty());
        // l1.clear();  Removes all of the elements from this list (optional operation). The list will be empty after this call returns.
        System.out.println("contains the passed object or not? = "+ l1.contains(2));
        System.out.println("gives hascode of given list = "+l1.hashCode());
        System.out.println("getLast() element = " + l1.getLast());
        
    }
}
