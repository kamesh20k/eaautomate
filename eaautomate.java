public class Main {
  final int x = 11;
  final double PI = 3.15;

  public static void main(String[] args) {
    Main myObj = new Main();
    myObj.x = 51; // will generate an error: cannot assign a value to a final variable
    myObj.PI = 27; // will generate an error: cannot assign a value to a final variable
    System.out.println(myObj.x);
  }
}
