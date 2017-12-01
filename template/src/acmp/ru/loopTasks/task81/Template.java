package acmp.ru.loopTasks.task81;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            int n = in.nextInt();
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        out.println(min);
        out.println(max);
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
