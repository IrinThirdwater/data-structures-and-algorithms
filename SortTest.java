import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class SortTest {

    private static int[] expected0;
    private static int[] expected1;
    private static int[] expected2;
    private static int[] expectedSorted;
    private static int[] expectedReverse;
    private static int[] expectedRandom;
    private static int[] expectedRandomBig;
    private static int[] expectedConstant;
    private static int[] expectedDuplicates;

    private int[] array0;
    private int[] array1;
    private int[] array2;
    private int[] arraySorted;
    private int[] arrayReverse;
    private int[] arrayRandom;
    private int[] arrayRandomBig;
    private int[] arrayConstant;
    private int[] arrayDuplicates;

    @BeforeAll static void setExpectedArrays () {
        expected0 = new int[0];
        expected1 = new int[]{8};
        expected2 = new int[]{2,8};
        expectedSorted = new int[]{-5,-1,0,2,7,26571};
        expectedReverse = new int[]{-1,3,6,7,9};
        expectedRandom = new int[]{-512,-256,2,6,11,457,512,75146};
        expectedRandomBig = new int[]{
                -1270152,-74521,-43122,-14325,-13252,-11445,
                -445,-123,-51,-51,-44,-32,-31,-13,1,3,41,43,
                89,117,126,131,456,462,645,1365,2138,4261,
                6443,6453,6674,7009,7751,10002,20917,21050,
                21342,21634,21643,22555,24251,35744,41322,
                42130,43124,44231,45350,46754,47561,61234,
                61322,64512,76813,77154,77929,102342,221232,
                270512,291139,462351,642512,645312,700921,
                785612,1465990,4125122,7812588,43270320
        };
        expectedConstant = new int[]{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
        expectedDuplicates = new int[]{-1,-1,0,0,0,2,2,2,3,4,4,4,7,7,7,9,9};
    }
    @BeforeEach void setTestArrays () {
        array0 = new int[0];
        array1 = new int[]{8};
        array2 = new int[]{8,2};
        arraySorted = new int[]{-5,-1,0,2,7,26571};
        arrayReverse = new int[]{9,7,6,3,-1};
        arrayRandom = new int[]{457,2,75146,-512,512,6,11,-256};
        arrayRandomBig = new int[]{
                456,117,43270320,-32,35744,131,462,20917,
                126,89,-74521,-44,3,77154,21050,21643,-51,
                21634,7812588,44231,-1270152,64512,785612,
                -51,4125122,700921,77929,291139,270512,645,
                4261,24251,76813,642512,102342,462351,6453,
                43124,45350,6443,7009,-123,-11445,10002,43,
                2138,42130,-13252,-43122,47561,61322,6674,
                41322,645312,61234,7751,41,1365,-14325,-31,
                21342,46754,221232,22555,-13,-445,1465990,1
        };
        arrayConstant = new int[]{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
        arrayDuplicates = new int[]{4,9,4,-1,9,0,2,2,2,7,-1,0,3,4,7,0,7};
    }

    @AfterEach void cleanTestArrays () {
        array0 = null;
        array1 = null;
        array2 = null;
        arraySorted = null;
        arrayReverse = null;
        arrayRandom = null;
        arrayRandomBig = null;
        arrayConstant = null;
        arrayDuplicates = null;
    }
    @AfterAll static void cleanExpectedArrays () {
        expected0 = null;
        expected1 = null;
        expected2 = null;
        expectedSorted = null;
        expectedReverse = null;
        expectedRandom = null;
        expectedRandomBig = null;
        expectedConstant = null;
        expectedDuplicates = null;
    }

    @Test void insertionSort0 () {
        assertArrayEquals(expected0, Sort.insertionSort(array0));
    }
    @Test void insertionSort1 () {
        assertArrayEquals(expected1, Sort.insertionSort(array1));
    }
    @Test void insertionSort2 () {
        assertArrayEquals(expected2, Sort.insertionSort(array2));
    }
    @Test void insertionSortSorted () {
        assertArrayEquals(expectedSorted, Sort.insertionSort(arraySorted));
    }
    @Test void insertionSortReverse () {
        assertArrayEquals(expectedReverse, Sort.insertionSort(arrayReverse));
    }
    @Test void insertionSortRandom () {
        assertArrayEquals(expectedRandom, Sort.insertionSort(arrayRandom));
    }
    @Test void insertionSortRandomBig () {
        assertArrayEquals(expectedRandomBig, Sort.insertionSort(arrayRandomBig));
    }
    @Test void insertionSortConstant () {
        assertArrayEquals(expectedConstant, Sort.insertionSort(arrayConstant));
    }
    @Test void insertionSortDuplicates () {
        assertArrayEquals(expectedDuplicates, Sort.insertionSort(arrayDuplicates));
    }

    private String arrayToString (int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        for (int i : array) {
            sb.append(i).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("}");
        return sb.toString();
    }

}