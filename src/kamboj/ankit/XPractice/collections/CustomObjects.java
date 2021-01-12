package kamboj.ankit.XPractice.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

 class Person{
  private int id;
  private String name;

  public Person(int id,String name){
    this.id=id;
    this.name=name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }

   @Override
   public boolean equals(Object o) {
     if (this == o) {
       return true;
     }
     if (!(o instanceof Person)) {
       return false;
     }
     Person person = (Person) o;
     return id == person.id &&
         Objects.equals(name, person.name);
   }

   //If you want to use maps and sets in your class custom objects
   // and for them to work correctly we need to override equals and hashcode method

   @Override
   public int hashCode() {
     return Objects.hash(id, name);
   }
 }

public class CustomObjects {

  public static void main(String[] args) {
    //it doesn't add one again from  fourth place as ids unique in maps and they can store one value at a time
    Map<String,Integer> map = new HashMap<>();
    map.put("one",1);
    map.put("two",2);
    map.put("three",3);
    map.put("one",4);

    for(String key: map.keySet()){
      System.out.println(key + " : " +map.get(key));
    }

    Set<String> set =new LinkedHashSet<>();
    set.add("dog");
    set.add("cat");
    set.add("mouse");
    set.add("cat");

    System.out.println(set);

    //using set and maps on classes
    //override hashcode amd equals method

    Person p1=new Person(1,"bob");
    Person p2=new Person(2,"sbob");
    Person p3=new Person(3,"mbob");
    Person p4=new Person(4,"cabob");
    Person p5=new Person(1,"bob");

    Map<Person,Integer> map2=new LinkedHashMap<>();
    map2.put(p1,1);
    map2.put(p2,2);
    map2.put(p3,3);
    map2.put(p4,4);
    map2.put(p5,5);

    for(Person key: map2.keySet()){
      System.out.println(key + " : " + map2.get(key));
    }

    Set<Person> set2 = new LinkedHashSet<>();
    set2.add(p1);
    set2.add(p2);
    set2.add(p3);
    set2.add(p4);
    set2.add(p5);

    System.out.println(set2);
  }
}
