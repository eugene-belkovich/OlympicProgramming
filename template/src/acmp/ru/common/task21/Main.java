package acmp.ru.common.task21;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int min = Math.min(n3, Math.min(n1, n2));
        int max = Math.max(n3, Math.max(n1, n2));

        out.println(max-min);
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