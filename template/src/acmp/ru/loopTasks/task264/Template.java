package acmp.ru.loopTasks.task264;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int count = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int ai = in.nextInt();
            if(ai > 0) {
                count++;
                max = Math.max(count, max);
            } else {
                count = 0;
            }
        }
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