package kamboj.ankit.XPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serialization implements Serializable {
  private static  final long serialVersionUID = 4801633306273802062L;
  private int id;
  private String name;


  public Serialization(int id, String name) {
    this.id = id;
    this.name = name;
  }


  @Override
  public String toString() {
    return "Serialization [id=" + id + ", name=" + name + "]";
  }

  public static void main(String[] args) {

    //write object

    System.out.println("writing objects");
    Serialization sz=new Serialization(10,"sam");
    Serialization sz1=new Serialization(20,"jack");

    System.out.println(sz);
    System.out.println(sz1);

    try {
      FileOutputStream fs= new FileOutputStream("people.bin");

      ObjectOutputStream os = new ObjectOutputStream(fs);
      os.writeObject(sz);
      os.writeObject(sz1);
      os.close();

      //reading objects
      System.out.println();
      System.out.println("reading objects");
      FileInputStream fi=new FileInputStream("people.bin");
      ObjectInputStream oi=new ObjectInputStream(fi);

      Serialization sr1= (Serialization) oi.readObject();
      Serialization sr2= (Serialization) oi.readObject();

      oi.close();

      System.out.println(sr1);
      System.out.println(sr2);

    } catch (FileNotFoundException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      //TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
