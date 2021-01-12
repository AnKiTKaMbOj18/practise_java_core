package kamboj.ankit.XPractice.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* Thread Pool - Represents a group of worker threads that are waiting for the job and reuse many times
 * In case of thread pool a group of fixed size threads are created. A thread from the thread poll
   is pulled out and assigned a job by the service provider.After completion of the job , thread is
   contained in the thread pool
 */

class WorkerThread implements Runnable {

  private int id;

  public WorkerThread(int id) {
    this.id = id;
  }

  @Override
  public void run() {
    System.out.println("starting: " + id);

    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("finished: " + id);
  }
}

public class ExampleT5 {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newFixedThreadPool(2);

    for (int i = 0; i < 5; i++) {
      executor.submit(new WorkerThread(i));
    }
    executor.shutdown();

    System.out.println("All tasks submitted.");
    try {
      executor.awaitTermination(1, TimeUnit.DAYS);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("All tasks completed.");
  }
}
