package antiTraversingArray;

public class ArrayDataLoader {

  private static ArrayDataLoader instance = null;

  private ArrayDataLoader() {
    // Exists only to avoid instantiation.
  }

  public static ArrayDataLoader getInstance() {
    if (instance == null) {
      instance = new ArrayDataLoader();
    }
    return instance;
  }

  public char[][] retrieveThreeRowsEightColumnsArray() {
    return new char[][] {
      {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I'},
      {'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q'},
      {'R', 'S', 'T', 'U', 'V', 'X', 'Z', 'W'}
    };
  }

  public char[][] retrieveTwoRowsFiveColumnsArray() {
    return new char[][] {
      {'A', 'B', 'C', 'D', 'E'},
      {'F', 'G', 'H', 'I', 'J'}
    };
  }

  public char[][] retrieveFourRowsFourColumnsArray() {
    return new char[][] {
      {'A', 'B', 'C', 'D'},
      {'E', 'F', 'G', 'H'},
      {'I', 'J', 'K', 'L'},
      {'M', 'N', 'O', 'P'}
    };
  }

  public char[][] retrieveThreeRowsThreeColumnsArray() {
    return new char[][] {
      {'A', 'B', 'C'},
      {'D', 'E', 'F'},
      {'G', 'H', 'I'}
    };
  }
}
