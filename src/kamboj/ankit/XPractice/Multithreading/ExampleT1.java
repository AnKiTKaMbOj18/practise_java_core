package kamboj.ankit.XPractice.Multithreading;

/* Multithreading - process of executing multiple threads simultaneously
   - It doesn't blocks users and one can perform multiple operations as same time
   -

   Two ways we can create threads first way by extending Thread class,
   second is by implementing Runnable interface , below is first one.
*/

public class ExampleT1 extends Thread {

  private String threadName;

  ExampleT1(String threadName) {
    this.threadName = threadName;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread " + threadName + ": " + i);

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    ExampleT1 runner1 = new ExampleT1("one");
    runner1.start();

    ExampleT1 runner2 = new ExampleT1("two");
    runner2.start();
  }
}
