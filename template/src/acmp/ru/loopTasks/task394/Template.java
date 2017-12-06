package acmp.ru.loopTasks.task394;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int m = in.nextInt();
        int a = n;
        int b = m;
        while ( b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        int gcd = a;
        out.println(n / gcd);
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