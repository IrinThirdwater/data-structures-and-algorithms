import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class SortTest {

    @ParameterizedTest
    @EnumSource(TestCase.class)
    void insertionSort (TestCase testCase) {
        assertArrayEquals(
            testCase.expectedArray(),
            Sort.insertionSort(testCase.testArray()),
            testCase.toString()
        );
    }

    @ParameterizedTest
    @EnumSource(TestCase.class)
    void selectionSort (TestCase testCase) {
        assertArrayEquals(
            testCase.expectedArray(),
            Sort.selectionSort(testCase.testArray()),
            testCase.toString()
        );
    }

    @Nested
    class isSortedTest {
        private int[] testSingleton;
        private int[] testConstant;
        private int[] testIncreasing;
        private int[] testNondecreasing;
        private int[] testDecreasing;
        private int[] testNonincreasing;
        private int[] testMixed;

        @BeforeEach void setTestArrays () {
            testSingleton = new int[]{2};
            testConstant = new int[]{8,8,8,8,8,8,8};
            testIncreasing = new int[]{-10,0,2,3,7,22};
            testNondecreasing = new int[]{-1,-1,2,7,44,44,44,63,67};
            testDecreasing = new int[]{99,98,97,4,1,-3};
            testNonincreasing = new int[]{172,145,143,143,143,22,-7,-7};
            testMixed = new int[]{42,9,1337,-15,4,0};
        }

        @Test void isSortedSingleton () {
            assertTrue(Sort.isSorted(testSingleton));
        }
        @Test void isSortedConstant () {
            assertTrue(Sort.isSorted(testConstant));
        }
        @Test void isSortedIncreasing () {
            assertTrue(Sort.isSorted(testIncreasing));
        }
        @Test void isSortedNondecreasing () {
            assertTrue(Sort.isSorted(testNondecreasing));
        }
        @Test void isSortedDecreasing () {
            assertFalse(Sort.isSorted(testDecreasing));
        }
        @Test void isSortedNonincreasing () {
            assertFalse(Sort.isSorted(testNonincreasing));
        }
        @Test void isSortedMixed () {
            assertFalse(Sort.isSorted(testMixed));
        }
    }

}
