package acmp.ru.loopTasks.task233;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int ai = in.nextInt();
            if (ai <= 437 ) {
                out.println("Crash " + (i+1));
                return;
            }
        }
        out.println("No crash");
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
