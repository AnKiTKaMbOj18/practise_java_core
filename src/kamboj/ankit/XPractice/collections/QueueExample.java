package kamboj.ankit.XPractice.collections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueExample {

  public static void main(String[] args) {
    //add , remove , element
    //offer , poll , peek

    Queue<Integer> q1 = new ArrayBlockingQueue<>(3);
//    System.out.println("Head(peek) of queue is : " + q1.element());

    q1.add(10);
    q1.add(20);
    q1.add(30);
    System.out.println("Head of queue is : " + q1.element());

    try {
      q1.add(40);
    } catch (IllegalStateException e) {
      System.out.println(" Tried adding to many items to the queue (above capacity)");
    }

    for (Integer value : q1) {
      System.out.println("Queue value : " + value);
    }

    System.out.println("Removed from queue: "+q1.remove());
    System.out.println("Removed from queue: "+q1.remove());
    System.out.println("Removed from queue: "+q1.remove());

    try{
      System.out.println("Removed from queue: "+q1.remove());
    }catch (NoSuchElementException e){
      System.out.println("Tried to remove to many items from queue (removing from empty queue)");
    }



    Queue<Integer> q2 = new ArrayBlockingQueue<>(3);
    System.out.println("Head(peek) of queue is : " + q2.peek());

    q2.add(10);
    q2.add(20);
    q2.add(30);
    System.out.println("Head(peek) of queue is : " + q2.peek());

    try {

    } catch (IllegalStateException e) {
      System.out.println(" Tried adding to many items to the queue (above capacity)");
    }

    for (Integer value : q2) {
      System.out.println("Queue value : " + value);
    }

    System.out.println("Removed from queue(poll): "+q2.poll());
    System.out.println("Removed from queue(poll): "+q2.poll());
    System.out.println("Removed from queue(poll): "+q2.poll());

    try{
      System.out.println("Removed from queue: "+q2.poll());
      if(q2.poll()==null){
        System.out.println("queue is empty nothing to remove");
      }
    }catch (NoSuchElementException e){
      System.out.println("Tried to remove to many items from queue (removing from empty queue)");
    }

  }
}
