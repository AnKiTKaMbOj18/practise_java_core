package kamboj.ankit.XPractice.collections;


interface Executable{
  public void execute();
  public int executeValue();
}

class Runner{
  public void run(Executable e){
    System.out.println("Executing code block...");
    e.execute();
    int value=e.executeValue();
    System.out.println("value from executeValue function of interface is :" + value);
  }
}

//()->System.out.println("Hello there lambda expression code ...");

public class LambdaExpressionExampleJ8 {

  public static void main(String[] args) {
    Runner runner=new Runner();
    runner.run(new Executable() {
      @Override
      public void execute() {
        System.out.println("hello there");
      }

      @Override
      public int executeValue() {
        return 7;
      }
    });
    System.out.println("-------------------------------");
//    runner.run(()-> {
//       System.out.println("hello there this is done using lambda expression");
//       return 8;
//    });

  }
}
