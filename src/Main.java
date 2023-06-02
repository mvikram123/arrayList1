import java.util.*;
public class Main{


    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        List<String> list2 = new ArrayList<>();
        list2.add("Two");

        list1.remove(list2);
        System.out.println(list1);// output:[one , two , three]
        list1.removeAll(list2);
        System.out.println(list1);//output:[one,three] after removing of all elemnt in list1 which are present in list2.
    }
}
