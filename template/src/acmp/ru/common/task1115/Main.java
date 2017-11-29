package acmp.ru.common.task1115;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        out.println(K/N);
        out.println(K%N);
        if (K%N == 0) {
            out.println(0);
        } else {
            out.println(N - (K%N));
        }
    }
    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}