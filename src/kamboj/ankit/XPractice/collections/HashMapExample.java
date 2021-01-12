package kamboj.ankit.XPractice.collections;

import java.util.HashMap;
import java.util.Map;

//Maps interface in java
//1.Hash Maps - takes key value pair , not sorted
public class HashMapExample {

  public static void main(String[] args) {
    HashMap<Integer , String> map = new HashMap<>();

    map.put(1,"ankit");
    map.put(2,"mohit");
    map.put(3,"rahul");
    map.put(4,"someone");
    map.put(6,"him");
    map.put(5,"her");

    System.out.println(map.get(5));

    for(Map.Entry<Integer,String> entry : map.entrySet()){
      int key = entry.getKey();
      String value = entry.getValue();

      System.out.println(key + " : " + value);
    }
  }
}
