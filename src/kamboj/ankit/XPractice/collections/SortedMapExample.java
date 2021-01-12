package kamboj.ankit.XPractice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map interface
// sorted map - i.  HashMap - not sorted
//              ii. LinkedHashMap - returns values in same order we entered , remembers the order
//              iii.TreeMap - its sorted , sorts in natural order

public class SortedMapExample {

  public static  void testMap(Map<Integer , String> map){
    map.put(9,"dog");
    map.put(2,"vog");
    map.put(40,"coog");
    map.put(25,"shoog");
    map.put(10,"lioog");
    map.put(22,"tioog");
    map.put(30,"shioog");
    map.put(18,"miohog");

    for(Integer key: map.keySet()){
      String value = map.get(key);

      System.out.println(key + " : " + value);
    }
  }

  public static void main(String[] args) {
    Map<Integer , String> hashMap = new HashMap<>();
    Map<Integer , String> linkedHashMap = new LinkedHashMap<>();
    Map<Integer , String> treeMap = new TreeMap<>();

    testMap(treeMap);
  }
}
