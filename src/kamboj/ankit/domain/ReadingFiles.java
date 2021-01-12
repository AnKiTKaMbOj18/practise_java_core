package kamboj.ankit.domain;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFiles {

  public static void main(String[] args) throws FileNotFoundException {
    String fileName = "dummy.txt";
    File textFile= new File(fileName);
    Scanner sc = new Scanner(textFile);
    FileReader fr = new FileReader(textFile);
    String[] str = fileName.split("/domain");
    System.out.println("read value " + Arrays.toString(str));
  }
}
