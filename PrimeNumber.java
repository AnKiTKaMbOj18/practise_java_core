package practise_java_core;

public class PrimeNumber {

  public static void main(String[] args) {

   /* for (int i = 2; i <= 100; i++) {
      for (int j = 2; j <= i; j++) {
        if (i == j) {
          System.out.println(i + "prime number");
        } else if (i % j == 0) {
          break;
        }

      }
    }*/

    int i, j, k;
    for (i = 2; i <= 100; i++) {
      k = 0;
      for (j = 2; j <= i; j++) {
        if (i % j == 0) {
          k++;
        }
      }
      System.out.println("values of k: " + k + " with i: " + i);
      if (k == 1) {
        System.out.println(i);
      }

    }
  }
}
