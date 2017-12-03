package acmp.ru.loopTasks.task147;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int prev = 0;
        int next = 1;
        int curr;
        for (int i = 0; i < n; i++) {
            curr = next + prev;
            prev = next;
            next = curr;
        }


        out.println(prev);
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