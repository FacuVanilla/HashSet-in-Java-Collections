import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
  public static void main(String args[]) {
    Set<Integer> set = new HashSet<>();
    set.add(23);
    set.add(34);
    set.add(56);

    // Creating an ArrayList from existing set.
    List<Integer> list = new ArrayList<>(set);
    // Sorting the list.
    Collections.sort(list);

    list.forEach(System.out::println);
  }
}

