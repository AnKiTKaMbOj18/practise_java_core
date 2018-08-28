package practise_java_core;

//program to multiply  matrices
public class Array3 {

  public static void main(String[] args) {

    int arr1[] = {1, 2, 3};
    int arr2[] = {4, 5, 6};

    String arr3 = "";
    for (int i = 0; i < arr1.length; i++) {
      int num1 = arr1[i];
      int num2 = arr2[i];

      arr3 = arr3+Integer.toString(num1 * num2) + " ";
    }
    System.out.println(arr3);
  }
}
