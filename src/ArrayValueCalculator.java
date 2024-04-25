import Exceptions.ArrayDataException;
import Exceptions.ArraySizeException;

public class ArrayValueCalculator {

  public static int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {

    if (array.length != 4 || array[0].length != 4) {
      throw new ArraySizeException("array must have a 4x4 size");
    }

    int sum = 0;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        try {
          sum += Integer.parseInt(array[i][j]);
        } catch (NumberFormatException e) {
          throw new ArrayDataException("Wrong data in array with coordinates [" + i + "][" + j + "]");
        }
      }
    }

    return sum;
  }

}
