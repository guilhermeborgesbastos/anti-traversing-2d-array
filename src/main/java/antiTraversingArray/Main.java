package antiTraversingArray;

import antiTraversingArray.Utils.ArrayUtils;

public class Main {

  public static void main(String... args) {

    char[][] board = {
        {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I'},
        {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'},
        {'R', 'S', 'T', 'U', 'V', 'X', 'Z', 'W'}
    };

    System.out.println(ArrayUtils.retrieveArrElement(board, 0));
    System.out.println(ArrayUtils.retrieveArrElement(board, 8));
    System.out.println(ArrayUtils.retrieveArrElement(board, 16));
  }

}
