import java.io.*;
import java.util.*;

public class BinarySearch {

    static long binarySearch(long[] a, long x) {
        long left = 0, right = a.length;
        while(left<right){
        	int mid=(int)(left+right)/2;
        	
        	if(x==a[mid])
        		return mid;
        
        	else if(x<a[mid])
        		right=mid;
        
        	else if(x>a[mid])
        		left=mid+1;
        }
        return -1;
    }

    static long linearSearch(long[] a, long x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLong();
        }
        int m = scanner.nextInt();
        long[] b = new long[m];
        for (int i = 0; i < m; i++) {
          b[i] = scanner.nextLong();
        }
        for (int i = 0; i < m; i++) {
            //replace with the call to binarySearch when implemented
            System.out.print(binarySearch(a, b[i]) + " ");
        }
    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        long nextLong() {
            return Long.parseLong(next());
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
