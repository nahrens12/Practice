public class UniqueSum {


    public static int UniqueSum(int a, int b, int c) {

        if (a == b && b == c ) {
            return 0;
        }
        if (a == b) {
            return c;
        }
        if (b == c) {
            return a;
        }
        if (a==c) {
            return b;
        }
        return 0;
    }
}