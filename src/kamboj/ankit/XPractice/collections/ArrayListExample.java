package kamboj.ankit.XPractice.collections;

import java.util.ArrayList;

// Collections ArrayList

public class ArrayListExample {

  public static void main(String[] args) {

    ArrayList<Integer> list = new ArrayList<Integer>();
    list.add(10);
    list.add(100);
    list.add(200);

    //getting value from array list
    System.out.println(list.get(0));

    System.out.println();
    //iterating over array list iteration #1
    System.out.println("Iteration #1");

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println();
    //iteration #2
    System.out.println("Iteration #2");
    for (Integer value : list) {
      System.out.println(value);
    }

    System.out.println();
    System.out.println("After removing value from last index");
    list.remove(list.size() - 1);
    System.out.println("list size "+list.size());
    System.out.println("list "+list);
  }
}
