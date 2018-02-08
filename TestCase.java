public enum TestCase {

    ZERO(
        "0",        // name
        new int[0], // sortedArray
        new int[0]  // testArray
    ),
    ONE(
        "1",
        new int[]{8},
        new int[]{8}
    ),
    TWO(
        "2",
        new int[]{2,8},
        new int[]{8,2}
    ),
    SORTED(
        "Sorted",
        new int[]{-5,-1,0,2,7,26571},
        new int[]{-5,-1,0,2,7,26571}
    ),
    REVERSE(
        "Reverse-sorted",
        new int[]{-1,3,6,7,9},
        new int[]{9,7,6,3,-1}
    ),
    RANDOM(
        "Random (small)",
        new int[]{-512,-256,2,6,11,457,512,75146},
        new int[]{457,2,75146,-512,512,6,11,-256}
    ),
    RANDOM_BIG(
        "Random (big)",
        new int[]{
            -1270152,-74521,-43122,-14325,-13252,-11445,
            -445,-123,-51,-51,-44,-32,-31,-13,1,3,41,43,
            89,117,126,131,456,462,645,1365,2138,4261,
            6443,6453,6674,7009,7751,10002,20917,21050,
            21342,21634,21643,22555,24251,35744,41322,
            42130,43124,44231,45350,46754,47561,61234,
            61322,64512,76813,77154,77929,102342,221232,
            270512,291139,462351,642512,645312,700921,
            785612,1465990,4125122,7812588,43270320
        },
        new int[]{
            456,117,43270320,-32,35744,131,462,20917,
            126,89,-74521,-44,3,77154,21050,21643,-51,
            21634,7812588,44231,-1270152,64512,785612,
            -51,4125122,700921,77929,291139,270512,645,
            4261,24251,76813,642512,102342,462351,6453,
            43124,45350,6443,7009,-123,-11445,10002,43,
            2138,42130,-13252,-43122,47561,61322,6674,
            41322,645312,61234,7751,41,1365,-14325,-31,
            21342,46754,221232,22555,-13,-445,1465990,1
        }
    ),
    CONSTANT(
        "Constant",
        new int[]{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8},
        new int[]{8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8}
    ),
    DUPLICATES(
        "Duplicates",
        new int[]{-1,-1,0,0,0,2,2,2,3,4,4,4,7,7,7,9,9},
        new int[]{4,9,4,-1,9,0,2,2,2,7,-1,0,3,4,7,0,7}
    );

    private final String name;
    private final int[] sortedArray;
    private final int[] testArray;

    // Constructor
    TestCase (String name, int[] sortedArray, int[] testArray) {
        this.name = name;
        this.sortedArray = sortedArray;
        this.testArray = testArray;
    }
    // Accessors
    public int[] expectedArray () {
        return this.sortedArray;
    }
    public int[] testArray () {
        return this.testArray.clone();
    }
    @Override public String toString () {
        return this.name;
    }

}
