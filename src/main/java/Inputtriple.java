import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Inputtriple {
    public static void main(String[] arg){
        String s = "Hello World";
        s.concat(s).indexOf(s);
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);
        String string1 = "hello";
        String string2 = string1;
        string1 = "world";
        StdOut.println(string1);
        StdOut.println(string2);
        StdOut.println(ln(10));
        StdOut.println(Math.log(10*9*8*7*6*5*4*3*2));
        StdOut.println(exR1(6));
        StdOut.println(mystery(2,25));
        StdOut.println(mystery(3,11));
        int[] xa = {1,2,3,4,5,6,7,2,3,4,5,7};
        int M = 5;
        histogram( xa, M);
        int N = StdIn.readInt();
        StdOut.println(lg(N));
        int sum = 0;
        for(int i =1; i<1000; i++){
            for(int j =0; j<i; j++){
                sum++;
            }
        }
        StdOut.println(sum);
        sum = 0;
        for(int i = 1; i < 1000; i *= 2){
            for(int j =0; j<1000; j++){
                sum++;
            }
        }
        StdOut.println(sum);
        System.out.println('b');
        System.out.println('b'+'c');
        System.out.println((char)('a'+4));

        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
        Integer.toBinaryString(sum);
        int f = 0, g = 1;
        for(int i = 0 ; i <= 15 ;i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
        int a,b,c;
        a = StdIn.readInt();
        b = StdIn.readInt();
        c = StdIn.readInt();
        if(a == b && b == c && a == c){
            System.out.println("equal ");
        }else{
            System.out.println("not equal");
        }
        double x,y;
        x = Math.random();
        y = Math.random();
        if((x>0 && x<1) && (y>0 && y<1)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    public static int lg(int N){
        int i = 1;
        for(int j = 0 ; j < N; j++){
            if(N / 2 >= 2)
                i++;
            N = N / 2;
        }
        return i;
    }
    public static void histogram(int[] a, int M){
        int[] b = new int[M];
        for(int j = 0;j < b.length; j++){
            b[j] = 0;
            for(int i = 0;i < a.length; i++){
                if(a[i] == j){
                    b[j] ++ ;
                }
            }
        }
        int s = 0;
        for(int x : b){
            s += x;
        }
        StdOut.println(s);
        StdOut.println(a.length);
    }
    public static int mystery( int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return mystery( a + a, b / 2);
        return mystery( a + a, b / 2) + a;
    }
    public static String exR1(int n){
        if (n <= 0) return "";
        return exR1(n-3) + n + exR1(n-2) + n;
    }
    //ln(N!)
    public static double ln(int N){
        if(N == 1) return Math.log(N);
        return Math.log(N) + ln(N-1);
    }
}
