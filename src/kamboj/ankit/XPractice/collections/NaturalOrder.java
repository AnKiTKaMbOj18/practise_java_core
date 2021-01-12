package kamboj.ankit.XPractice.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class NaturalOrder {

  public static void main(String[] args) {
    List<String> list =new ArrayList<>();
    SortedSet<String> set = new TreeSet<>();

    addElements(list);
    addElements(set);

    Collections.sort(list);

    showElements(list);
    System.out.println();
    showElements(set);
  }

  private static void addElements(Collection<String> col){
    col.add("joe");
    col.add("sue");
    col.add("xuliet");
    col.add("clarke");
    col.add("mark");
  }

  private static void showElements(Collection<String> col){
    for(String element: col){
      System.out.println(element);
    }
  }
}
