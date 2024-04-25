import Exceptions.ArrayDataException;
import Exceptions.ArraySizeException;

public class Main {

  public static void main(String[] args) {

    String[][] testArray = {
        {"15", "21", "78", "45"},
        {"5", "55", "20", "8"},
        {"0", "10", "1", "12"},
        {"13", "54", "101", "11"}
    };

    try {
      System.out.println("Result: " + ArrayValueCalculator.doCalc(testArray));
    } catch (ArraySizeException e) {
      System.err.println("Array size exception: " + e.getMessage());
    } catch (ArrayDataException e) {
      System.err.println("Array cell exception: " + e.getMessage());
    }

  }
}
