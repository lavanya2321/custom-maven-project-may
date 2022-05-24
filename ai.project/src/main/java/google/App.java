package google;

/**
 * Hello world!
 *
 */
public class App 
{
    public class Main {

    public void main(String[] args) {
    int rows = 5;

    for (int i = 1; i <= rows; ++i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
}
