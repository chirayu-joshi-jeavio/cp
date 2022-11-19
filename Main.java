import java.io.*;
import java.util.*;


public class Main {

    private static void solve() {
        // Write your code here
    }

    // -----------------------------------------------------------------

    public static void main(String[] args) {
        sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        int t = 1;
        t = sc.nextInt();   // Comment down this line for single test case
        while (t != 0) {
            solve();
            --t;
        }

        out.close();
    }

    public static MyScanner sc;
    public static PrintWriter out;

    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static int[] scanIntArr(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static long[] scanLongArr(int n) {
        long[] arr = new long[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextLong();
        }
        return arr;
    }
    public static double[] scanDoubleArr(int n) {
        double[] arr = new double[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextDouble();
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int element : arr) out.print(element + " ");
        out.println();
    }
    public static void printArr(long[] arr) {
        for (long element : arr) out.print(element + " ");
        out.println();
    }
    public static void printArr(double[] arr) {
        for (double element : arr) out.print(element + " ");
        out.println();
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        if (idx1 < 0 || idx2 < 0 || idx1 >= arr.length || idx2 >= arr.length) return;
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void swap(long[] arr, int idx1, int idx2) {
        if (idx1 < 0 || idx2 < 0 || idx1 >= arr.length || idx2 >= arr.length) return;
        long temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void swap(double[] arr, int idx1, int idx2) {
        if (idx1 < 0 || idx2 < 0 || idx1 >= arr.length || idx2 >= arr.length) return;
        double temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static int min(int ...arr) {
        int res = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element < res) res = element;
        }
        return res;
    }
    public static long min(long ...arr) {
        long res = Long.MAX_VALUE;
        for (long element : arr) {
            if (element < res) res = element;
        }
        return res;
    }
    public static double min(double ...arr) {
        double res = Double.MAX_VALUE;
        for (double element : arr) {
            if (element < res) res = element;
        }
        return res;
    }

    public static int minIdx(int ...arr) {
        int resIdx = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[resIdx]) {
                resIdx = i;
            }
        }
        return resIdx;
    }
    public static int minIdx(long ...arr) {
        int resIdx = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[resIdx]) {
                resIdx = i;
            }
        }
        return resIdx;
    }
    public static int minIdx(double ...arr) {
        int resIdx = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[resIdx]) {
                resIdx = i;
            }
        }
        return resIdx;
    }

    public static int max(int ...arr) {
        int res = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > res) res = element;
        }
        return res;
    }
    public static long max(long ...arr) {
        long res = Long.MIN_VALUE;
        for (long element : arr) {
            if (element > res) res = element;
        }
        return res;
    }
    public static double max(double ...arr) {
        double res = Double.MIN_VALUE;
        for (double element : arr) {
            if (element > res) res = element;
        }
        return res;
    }

    public static int maxIdx(int ...arr) {
        int resIdx = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[resIdx]) {
                resIdx = i;
            }
        }
        return resIdx;
    }
    public static int maxIdx(long ...arr) {
        int resIdx = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[resIdx]) {
                resIdx = i;
            }
        }
        return resIdx;
    }
    public static int maxIdx(double ...arr) {
        int resIdx = 0;
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > arr[resIdx]) {
                resIdx = i;
            }
        }
        return resIdx;
    }

}
