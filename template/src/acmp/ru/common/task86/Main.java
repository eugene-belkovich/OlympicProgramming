package acmp.ru.common.task86;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int N = in.nextInt();
        out.println((int) Math.pow(N, 2)-3*(N-1)-1);
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
