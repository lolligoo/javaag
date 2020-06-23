import edu.princeton.cs.algs4.StdOut;

public class Fibonacci {
    public static long F( int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F( N- 1) + F( N- 2);
    }
    public static void main( String[] args) {
        f(100);
        for (int N = 0; N < 100; N++)
            StdOut. println( N + " " + F( N));
    }
    public static void f(int M){
        double f = 0, g = 1;
        for(int i = 0 ; i <= M ;i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}

