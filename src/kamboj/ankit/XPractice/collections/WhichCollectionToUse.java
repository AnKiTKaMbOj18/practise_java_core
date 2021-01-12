package kamboj.ankit.XPractice.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class WhichCollectionToUse {

  public static void main(String[] args) {
    /*
     * Consider -
     * 1.what you need the collections to do
     * 2.are you using the fastest collection for your purposes
     * (think about insertion/deletion, retrieval and traversal
     */

    ///////// LISTS ////////////

    //Store lists of objects
    //duplicates are allowed
    //objects remain in order
    //elements are indexed via an integer
    //cf. shopping list
    //checking for particular item in the list is slow
    //looking for item up by index is fast
    //iterating through lists is relatively fast
    //Note-you can sort lists if you want to

    //If you only add or remove items at end of lists ,use ArrayList.
    List<String> list1 = new ArrayList<>();

    //Removing or adding items elsewhere in the list?
    List<String> list2 = new LinkedList<>();

    ////////// SETS ////////////

    //only store unique values
    //great for removing duplicates
    //not indexed unlike lists
    //very fast to check if a particular objects exists
    // if you want to use your own objects
    // , you must implement hashcode() and equals()

    //order is unimportant and ok if it changes?
    //hashset is not ordered

    Set<String> set1 = new HashSet<>();

    //Sorted in natural order ? use TreeSet
    //(1,2,3 ...,a,b,c....etc)
    Set<String> set2 = new TreeSet<>();

    //Elements remain in order they were added
    Set<String> set3 = new LinkedHashSet<>();

    //////////// MAPS ////////////////

    // Key value pairs
    //Like lookup tables
    //Retrieving a value by key is fast
    //Iterating over maps is slow
    //If you want to use your own objects as keys
    // you must implement hashCode() and equals()

    // Keys not in any particular order and order liable to change
    Map<String, String> map1 = new HashMap<>();

    //Keys sorted in natural order
    Map<String, String> map2 = new TreeMap<>();

    //Keys remain in order added
    Map<String, String> map3 = new LinkedHashMap<>();

    //There are also the SortedSet and SortedMap interfaces


  }
}
