import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    static int N,M;
    static String[] source;
    static Set<String> S ;
    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        S = new HashSet<>();
        source = new String[M];

        for (int i = 0; i < N; i++) {
            S.add(scan.next());
        }
        for (int i = 0 ; i < M ; i++){
            source[i] = scan.next();
        }
    }

    static int pro(){
        int count = 0 ;

        for (int i = 0 ; i < M ; i++)
            if (S.contains(source[i])) count++;

        return count;
    }

    public static void main(String[] args) {
        input();
        int count = pro();
        System.out.println(count);
    }



    static class FastReader{
        BufferedReader br ;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next(){
            while(st == null || !st.hasMoreElements()){
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        int nextInt(){
            return Integer.parseInt(next());
        }

        long nextLong(){
            return Long.parseLong(next());
        }

        double nextDouble(){
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";

            try {
                str = br.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return str;
        }
    }
}
