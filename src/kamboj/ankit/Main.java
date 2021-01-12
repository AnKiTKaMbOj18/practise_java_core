package kamboj.ankit;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import kamboj.ankit.domain.MountainBike;

public class Main {

  public static void main(String[] args) {
    MountainBike mountainBike = new MountainBike(10, 20, 2, 5);
    int cad = mountainBike.getCadence();
    System.out.println("cad " + cad);

    //just for learning udemy java lecture #33
    String fileName = "test.txt";
    File textFile = new File(fileName);
    try {
      Scanner sc = new Scanner(textFile);
      System.out.println("file text " + sc.nextLine());
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}