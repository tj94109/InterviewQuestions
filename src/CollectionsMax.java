import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsMax {

    public static void main(String[] args){

        List<Integer> myList= new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        Integer myInteger = Collections.max(myList);
        System.out.println(myInteger);
    }


}
