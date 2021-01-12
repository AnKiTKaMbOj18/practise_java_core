package kamboj.ankit.XPractice.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class compareComparator implements Comparator<String> {

  //sorting on the basis of the string length

  @Override
  public int compare(String o1, String o2) {

    String val;
    int len1 = o1.length();
    int len2 = o2.length();

    if (len1 > len2) {
      return 1;
    } else if (len1 < len2) {
      return -1;
    }
    return 0;

    //sorting in alphabetic order
    //return o1.compareTo(o2);
    //sorting in reverse alphabetic order
    //return -o1.compareTo(o2);
  }
}


class Human {

  int id;
  String name;

  Human(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Human{" +
        "id=" + id +
        ", name='" + name + '\'' +
        '}';
  }
}


public class SortingLists {

  public static void main(String[] args) {

    //Sorting strings

    List<String> animals = new ArrayList<>();
    animals.add("fox");
    animals.add("ant");
    animals.add("rat");
    animals.add("mouse");
    animals.add("tiger");

    Collections.sort(animals);

    for (String animal : animals) {
      System.out.println(animal);
    }

    System.out.println();

    Collections.sort(animals, new compareComparator());

    for (String animal : animals) {
      System.out.println(animal);
    }

    System.out.println();

    //Sorting numbers

    List<Integer> numbers = new ArrayList<>();
    numbers.add(3);
    numbers.add(36);
    numbers.add(73);
    numbers.add(40);

    Collections.sort(numbers);

    for (Integer number : numbers) {
      System.out.println(number);
    }

    //Sorting arbitrary objects

    List<Human> human = new ArrayList<>();
    human.add(new Human(1, "zob"));
    human.add(new Human(4, "manon"));
    human.add(new Human(5, "john"));
    human.add(new Human(2, "adobe"));
    human.add(new Human(3, "bob"));

    System.out.println(human);

    System.out.println("sorting in order of id");
    // sorting in order of name

    Collections.sort(human, new Comparator<Human>() {

      @Override
      public int compare(Human h1, Human h2) {

        if (h1.getId() > h2.getId()) {
          return 1;
        } else if (h1.getId() < h2.getId()) {
          return -1;
        }
        return 0;
      }
    });

    System.out.println(human);
    for (Human humans : human) {
      System.out.println(humans);
    }
    System.out.println();

    System.out.println("Sorting in order of name");

    // Sorting in order of name

    Collections.sort(human, new Comparator<Human>() {
      @Override
      public int compare(Human h1, Human h2) {
        return h1.getName().compareTo(h2.getName()) ;
      }
    });

    for(Human name: human){
      System.out.println(name);
    }

    System.out.println(human);
  }
}
