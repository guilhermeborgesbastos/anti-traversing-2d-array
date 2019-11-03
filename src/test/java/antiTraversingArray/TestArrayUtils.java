package antiTraversingArray;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import antiTraversingArray.Utils.ArrayUtils;

public class TestArrayUtils {

  private static final ArrayDataLoader DATA = ArrayDataLoader.getInstance();

  @ParameterizedTest(name = "{index} - Testing {0}...")
  @MethodSource("createTestCases")
  void testRetrieveArrElement_usingFormula(String testDescription, char[][] array, int[] targetPositions, char[] expectedValues) {

    assertThat("The targer positions and the expected values must match in length.",
        targetPositions.length, is(expectedValues.length));

    for(int i = 0; i < expectedValues.length; i++) {
      assertThat(expectedValues[i],
          is(ArrayUtils.retrieveArrElement(array, targetPositions[i])));
    }
  }

  private static Stream<Arguments> createTestCases() {
    return Stream.of(
        // Tests for a matrix of [3][3] dimension.
        Arguments.of(
            "3 rows and 8 columns array in a vertical selection at the fist column",
            DATA.retrieveThreeRowsEightColumnsArray(),
            new int[] {0, 8, 16},
            new char[] {'A', 'J', 'R'}
            ),
        Arguments.of(
            "3 rows and 8 columns array in a horizontal selection at the fist row",
            DATA.retrieveThreeRowsEightColumnsArray(),
            new int[] {0, 1, 2, 3, 4, 5, 6, 7},
            new char[] {'A', 'B', 'C', 'D', 'F', 'G', 'H', 'I'}
            ),
        Arguments.of(
            "3 rows and 8 columns array in a diagonal selection",
            DATA.retrieveThreeRowsEightColumnsArray(),
            new int[] {0, 9, 18, 2, 11, 20, 4, 13, 22},
            new char[] {'A', 'K', 'T', 'C', 'M', 'V', 'F', 'O', 'Z'}
            ),

        // Tests for a matrix of [2][5] dimension.
        Arguments.of(
            "2 rows and 5 columns array in a vertical selection at the second column",
            DATA.retrieveTwoRowsFiveColumnsArray(),
            new int[] {1, 6},
            new char[] {'B', 'G'}
            ),
        Arguments.of(
            "2 rows and 5 columns array in a horizontal selection at the second row",
            DATA.retrieveTwoRowsFiveColumnsArray(),
            new int[] {5, 6, 7, 8, 9},
            new char[] {'F', 'G', 'H', 'I', 'J'}
            ),
        Arguments.of(
            "2 rows and 5 columns array in a diagonal selection",
            DATA.retrieveTwoRowsFiveColumnsArray(),
            new int[] {0, 6, 1, 7, 2, 8, 3, 9},
            new char[] {'A', 'G', 'B', 'H', 'C', 'I', 'D', 'J'}
            ),

        // Tests for a matrix of [4][4] dimension.
        Arguments.of(
            "4 rows and 4 columns array in a vertical selection at the fist column",
            DATA.retrieveFourRowsFourColumnsArray(),
            new int[] {0, 4, 8, 12},
            new char[] {'A', 'E', 'I', 'M'}
            ),
        Arguments.of(
            "4 rows and 4 columns array in a horizontal selection at the third row",
            DATA.retrieveFourRowsFourColumnsArray(),
            new int[] {8, 9, 10, 11},
            new char[] {'I', 'J', 'K', 'L'}
            ),
        Arguments.of(
            "4 rows and 4 columns array in a diagonal selection",
            DATA.retrieveFourRowsFourColumnsArray(),
            new int[] {0, 5, 10, 15},
            new char[] {'A', 'F', 'K', 'P'}
            ),

        // Tests for a matrix of [3][3] dimension.
        Arguments.of(
            "3 rows and 3 columns array in a vertical selection at the last column (3rd)",
            DATA.retrieveThreeRowsThreeColumnsArray(),
            new int[] {2, 5, 8},
            new char[] {'C', 'F', 'I'}
            ),
        Arguments.of(
            "3 rows and 3 columns array in a horizontal selection at the last row (3rd)",
            DATA.retrieveThreeRowsThreeColumnsArray(),
            new int[] {6, 7, 8},
            new char[] {'G', 'H', 'I'}
            ),
        Arguments.of(
            "3 rows and 3 columns array in a diagonal selection",
            DATA.retrieveThreeRowsThreeColumnsArray(),
            new int[] {0, 4, 8},
            new char[] {'A', 'E', 'I'}
            )
        );
  }
}
