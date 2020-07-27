import edu.princeton.cs.algs4.StdOut;

public class ReBinarySearch {
    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 0);
    }

    public static int rank(int key, int[] a, int lo, int hi, int de) { //如果key存在于a[]中，它的索引不会小于lo且不会大于hi
        de++;

        StdOut.println(de);
        StdOut.println("lo: " + lo + ", hi: " + hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) return rank(key, a, lo, mid - 1, de);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, de);
        else return mid;
    }

    public static void main(String[] args) {
        int k = 9;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 22, 33, 35, 56, 78, 89, 98, 100, 1002, 1005, 1008, 1233};
        rank(k, a);
    }
}
