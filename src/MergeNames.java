
import java.util.Arrays;
import java.util.HashSet;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        HashSet<String> set = new HashSet();
        for(String s :Arrays.asList(names1)){
            set.add(s);
        }
        for(String s :Arrays.asList(names2)){
            set.add(s);
        }
        String[] array = new String[set.size()];
        return set.toArray(array);
    }

    public static void main(String[] args) {
        String[] names1 = new String[] {"Ava", "Emma", "Olivia"};
        String[] names2 = new String[] {"Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}