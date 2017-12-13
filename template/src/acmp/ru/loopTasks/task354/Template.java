package acmp.ru.loopTasks.task354;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (long d = 2; d*d <= n;) {
            if (n % d  == 0) {
                n /= d;
                out.print(d + "*");
            } else {
                d++;
            }
        }
        out.print(n);
    }

    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {

            solve(in, out);
        }

    }

    public static void main(String[] args) {
        new Template().run();
    }
}