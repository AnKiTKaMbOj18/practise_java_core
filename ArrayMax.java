package practise_java_core;

public class ArrayMax {

  public static void main(String[] args) {

    int arr[] = {20, 30, 40,50,67};

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] >= max) {
        max = arr[i];
      }
    }
    System.out.println(max);
  }
}
