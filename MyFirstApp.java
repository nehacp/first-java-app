public class MyFirstApp {
  public static void main (String[] args) {
    System.out.println("I Rule");
    System.out.println("The world");

    int x = 3;
    String name = "Dirk";
    x = x * 17;
    System.out.print("x is " + x);
    double d = Math.random();
    // comment

    while(x > 12) {
      x = x - 1;
    }

    for (int y = 0; y < 10; y = y + 1) {
      System.out.print("x is now " + y);
    }
  }
}