public class ProfileTestGood {

    public static void main(String[] args) {
        run();
    }

    public static void run() {
        int[][] a = createMatrix(1000);
        fillMatrix(a);
        long sum = computeFastSum(a);
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

    static long computeFastSum(int[][] a) {
        long sum = 0;

        long[] rowSums = new long[a.length];

        for (int i = 0; i < a.length; i++) {
            long s = 0;
            for (int j = 0; j < a.length; j++) {
                s += a[i][j];
            }
            rowSums[i] = s;
        }

        long totalRowSum = 0;
        for (long v : rowSums) {
            totalRowSum += v;
        }

        for (int i = 0; i < a.length; i++) {
            sum += totalRowSum;
        }

        return sum;
    }
}