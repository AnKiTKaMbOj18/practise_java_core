package kamboj.ankit.XPractice.Multithreading;


/*
Every object in java has an intrensive lock or a monitor lock or also called mute ex
 - using synchronization -
   synchronized method - you have to acquire before calling it and only one thread at a time can acquire intresic lock ,
   and other thread have to wait for first thread to release it.

*/

public class ExampleT3 {

  private int count = 0;

  private synchronized void increment() {
    count++;
  }

  private void doWork() {
    Thread t1 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          increment();
        }
      }
    });

    Thread t2 = new Thread(new Runnable() {
      @Override
      public void run() {
        for (int i = 0; i < 10000; i++) {
          increment();
        }
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
    System.out.println("Incremented value of count is: " + count);
  }

  public static void main(String[] args) {
    ExampleT3 exampleT3 = new ExampleT3();
    exampleT3.doWork();
  }
}
