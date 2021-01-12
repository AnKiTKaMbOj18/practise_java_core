package kamboj.ankit.XPractice.Multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Multiple locks using synchronized code blocks

class Worker {

  private Random random = new Random();

  private static final Object object1 = new Object();
  private static final Object object2 = new Object();

  private List<Integer> list1 = new ArrayList<>();
  private List<Integer> list2 = new ArrayList<>();

  private void stageOne() {
    synchronized (object1) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      list1.add(random.nextInt(100));
    }
  }

  private void stageTwo() {
    synchronized (object2) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      list2.add(random.nextInt(100));
    }
  }

  private void process() {
    for (int i = 0; i < 1000; i++) {
      stageOne();
      stageTwo();
    }
  }

  protected void main() {
    System.out.println("starting...");

    long start = System.currentTimeMillis();
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        process();
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        process();
      }
    });

    t1.start();
    t2.start();

    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    long end = System.currentTimeMillis();

    System.out.println("Time Taken: " + (end - start));
    System.out.println("List1 Size: " + list1.size() + " List2 Size: " + list2.size());
  }
}

public class ExampleT4 {

  public static void main(String[] args) {
    new Worker().main();
  }
}
