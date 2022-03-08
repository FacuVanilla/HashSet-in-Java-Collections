import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App {
  public static void main(String args[]) {
    Set<Integer> set = new HashSet<>();
    set.add(23);
    set.add(34);
    set.add(56);

    Iterator<Integer> itr = set.iterator();

    while(itr.hasNext()) {
      System.out.println(itr.next());
    }
  }
}

