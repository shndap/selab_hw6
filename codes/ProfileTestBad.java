public class ProfileTestBad {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int[][] a = createMatrix(1000);
        fillMatrix(a);
        long sum = computeBadSum(a);
        System.out.println(sum);
    }

    static int[][] createMatrix(int n) {
        return new int[n][n];
    }

    static void fillMatrix(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = i + j;
            }
        }
    }

    static long computeBadSum(int[][] a) {
        long sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int k = 0; k < a.length; k++) {
                sum += rowSum(a, k);
            }
        }

        return sum;
    }

    static long rowSum(int[][] a, int k) {
        long s = 0;
        for (int j = 0; j < a.length; j++) {
            s += a[k][j];
        }
        return s;
    }
}