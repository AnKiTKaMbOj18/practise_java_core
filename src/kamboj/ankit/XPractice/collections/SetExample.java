package kamboj.ankit.XPractice.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

//Set interface in java - set interface doesn't allow duplicate values ,
// it filters duplicates and keeps original value intact
//1.HashSet - does not retain order, but filters duplicates value
//2.LinkedHashSet - remembers the order in which you add values and doesn't allow duplicate values
//3.TreeSet - Tree set sorts the values in natural order and doesn't allows duplicates

public class SetExample {

  public static void main(String[] args) {
    Set<String> hashSet = new HashSet<>();
    Set<String> linkedHashSet = new LinkedHashSet<>();
    Set<String> treeSet = new TreeSet<>();

    setTest(hashSet);
  }

  public static  void setTest(Set<String> set){
    if(set.isEmpty()){
      System.out.println("set is empty - " + set.isEmpty());
    }
    set.add("dog");
    set.add("giraffe");
    set.add("bird");
    set.add("snale");
    set.add("pig");
    set.add("monk");
    set.add("cat");

    System.out.println(set);

    /////different methods of sets - 1. iteration over sets interface
    for(String element: set){
      System.out.println(element);
    }

    ///////2. does set contains a particular id/item
    if(set.contains("monkey")){
      System.out.println("it contains Monkey yayyyy");
    }

    if(set.contains("cat")){
      System.out.println("caty Cat is present in this set");
    }

    Set<String> set2=new HashSet<>();

    set2.add("dog");
    set2.add("giraffe");
    set2.add("many");
    set2.add("rat");

    ////// Intersection //////

    Set<String> intersection =new HashSet<>(set);
    intersection.retainAll(set2);
    System.out.println(intersection);

    ////// Difference //////
    Set<String> difference = new HashSet<>(set);
    difference.removeAll(set2);
    System.out.println(difference);
  }
}
