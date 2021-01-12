package kamboj.ankit.XPractice;

class Animal {
  Animal(){
    System.out.println("from parent animal class");
  }
}

public class SuperExample extends Animal {

  SuperExample(){
    super();
    System.out.println("from child");
  }

  public static void main(String[] args) {
    SuperExample superExample = new SuperExample();
  }
}
