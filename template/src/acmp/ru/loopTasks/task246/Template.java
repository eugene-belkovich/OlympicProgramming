package acmp.ru.loopTasks.task246;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int difs = 0;
        int curr;
        int a1 = in.nextInt();
        int prev = a1;
        for (int i = 1; i < n; i++) {
            curr = in.nextInt();
            if (curr != prev + 1) {
                difs++;
            }
            prev = curr;
        }
        out.println(difs);
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