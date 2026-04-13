import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {
    public static void main(String[] args) {
        java.util.Set<String> set = new HashSet<>();
        // java.util.Set<String> set = new LinkedHashSet<>(); //
        // java.util.Set<String> set = new TreeSet<>();

        set.add("Alex");
        set.add("Bob");
        set.add("Charlie");
        set.add("Alex");
        System.out.println(set);
    }
}
