package kamboj.ankit.XPractice.Multithreading;

//Second way of creating thread by implementing runnable interface and calling
// its run method by creating instance of thread class and passing class as constructor

public class ExampleT2 implements Runnable {

  private String threadName;

  ExampleT2(String threadName) {
    this.threadName = threadName;
  }

  @Override
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread " + this.threadName + ": " + i);

      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args) {
    ExampleT2 runner = new ExampleT2("one");
    Thread t1 = new Thread(runner);
    t1.start();
  }
}
