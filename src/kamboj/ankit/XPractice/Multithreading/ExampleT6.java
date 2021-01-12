package kamboj.ankit.XPractice.Multithreading;

/*
Inter-thread communication in Java
Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.

Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its
critical section and another thread is allowed to enter (or lock) in the same critical section to be
executed.It is implemented by following methods of Object class:

(a)wait()
(b)notify()
(c)notifyAll()

* */

import java.util.Scanner;

public class ExampleT6 {

  public static void main(String[] args) throws InterruptedException {
    final Processor processor1 = new Processor();
    final Consumer c = new Consumer();

    processor1.start();
    c.start();
//
//    processor1.join();
//    c.join();
  }
}

class Processor extends Thread {

  @Override
  public void run() {
    super.run();

    try {
      produce();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void produce() throws InterruptedException {
    synchronized (this) {
      System.out.println("Producer thread running...");
      wait();
      System.out.println("Resumed");
    }
  }
}

class Consumer extends Thread {

  @Override
  public void run() {
    super.run();

    try {
      consume();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  private void consume() throws InterruptedException {
    Scanner scanner = new Scanner(System.in);
    Thread.sleep(2000);

    synchronized (this) {
      System.out.println("Waiting for return key..");
//      scanner.nextLine();
      System.out.println("return key pressed");
      notifyAll();

      //notify doesn't passes control to next statement immediately but
      // it waits for the block it is in to finish.To show below we added sleep for 5 seconds
      //what it does is after notify , it waits for sleep to finish and block gets finished
      // then it reaquinshes the intrinsic lock

      Thread.sleep(5000);
    }
  }
}