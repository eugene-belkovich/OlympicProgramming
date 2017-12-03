package acmp.ru.loopTasks.task694;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int maxFirst = in.nextInt();
        int minSecond = in.nextInt();
        for (int i = 1; i < n; i++) {
            int first = in.nextInt();
            int second = in.nextInt();
            maxFirst = Math.max(maxFirst, first);
            minSecond = Math.min(minSecond, second);
        }
        if (maxFirst <= minSecond) {
            out.println("YES");
        } else {
            out.println("NO");
        }
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