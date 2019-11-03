package antiTraversingArray.Utils;

public class ArrayUtils {

  public static char retrieveArrElement(char[][] arr, int logicPosition) {
    int columnsLength = arr[0].length;
    int row = logicPosition / columnsLength;
    int col = logicPosition % columnsLength;
    return arr[row][col];
  }

}
