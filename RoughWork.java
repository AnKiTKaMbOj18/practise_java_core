package practise_java_core;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class RoughWork {

  public static void main(String[] args) throws IOException {

    /* Reading  file from location and printing its data
    String fileName="F:\\test1.txt";
    FileReader fileReader=new FileReader(fileName);
    BufferedReader bufferedReader=new BufferedReader(fileReader);
    String line=null;

    while(bufferedReader.readLine()!=null){
      line=bufferedReader.readLine();
      System.out.println(line);
    }
    bufferedReader.close();*/

    //writing file  to location
    String fileName="F:\\temp.txt";
    FileWriter fileWriter=new FileWriter(fileName);
    BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);

    bufferedWriter.write("Hello there,");
    bufferedWriter.write("here is some text for you");
    bufferedWriter.newLine();
    bufferedWriter.write("this is written in new line,");
    bufferedWriter.write("this is how it works");

    System.out.println();

    bufferedWriter.close();

  }
}