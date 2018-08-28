package practise_java_core;

public class Array2 {

  public static void main(String[] args) {

    int arr[] = {5, 7};
    boolean flag;
    int length = arr.length;
    System.out.println("length of array is: " + length);

    if (arr[0] == 4 || arr[0] == 7) {
      flag = true;
    } else {
      System.out.println(arr[1] == 4 || arr[1] == 7);
      System.out.println("hmm in else it is true");
    }

  }
}
