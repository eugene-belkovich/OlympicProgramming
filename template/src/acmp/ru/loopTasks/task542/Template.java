package acmp.ru.loopTasks.task542;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int r = 0;
        while(n != 0) {
            int d = n % 2;
            out.println("n1 " + n);
            out.println("d " + d);
            n /= 2;
            out.println("n2 " + n);
            r = r * 2 + d;
            out.println("r " + r);
        }
        out.println("answer " + r);
        out.println(83 / 2);

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
