package kamboj.ankit.XPractice.Multithreading;


class Customer {

  private int amount = 10000;

  synchronized void withdraw(int amount) {
    System.out.println("going to withdraw money");

    if (this.amount < amount) {
      System.out.println("Less balance , waiting for deposit...");
      try {
        wait();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
    System.out.println("balance before withdraw: " + this.amount);
    this.amount = this.amount - amount;
    System.out.println("withdraw completed, amount withdrawn: " + amount);
    System.out.println("balance after withdraw: " + this.amount);
  }

  synchronized void deposit(int amount) {
    System.out.println("goint to deposit");
    this.amount = this.amount + amount;
    System.out.println("amout deposited: " + amount);
    System.out.println("balance after deposit: " + this.amount);
    notify();
  }
}

class Child1 extends Thread {

  Customer c;

  Child1(Customer c) {
    this.c = c;
  }

  @Override
  public void run() {
    c.withdraw(15000);
  }
}

public class ExampleT7 {

  public static void main(String[] args) {
    final Customer cust = new Customer();
    Child1 child1 = new Child1(cust);

    child1.start();

    // Way :1 - using lambda function (arrow) for Thread
    new Thread(() -> cust.deposit(10000)).start();

  /*
  // Way: 2 - using anonymous class
   new Thread(){
      public void run(){
        cust.deposit(10000);
      }
    }.start();
    */
  }
}
