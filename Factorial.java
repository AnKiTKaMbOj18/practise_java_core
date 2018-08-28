package practise_java_core;

public class Factorial {

  int num;
  int factorial=1;
  public int fact(int num){
    for(int i=1;i<=num;i++){
      factorial=factorial*i;
    }
    return factorial;
  }
  public static void main(String[] args) {

    Factorial f=new Factorial();
    int fact_Num=f.fact(5);
    System.out.println("Factorial of number is "+fact_Num );
  }
}
