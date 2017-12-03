package acmp.ru.loopTasks.task623;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int prev = 1;
        int curr = 1;
        int next;
        for (int i = 0; i < n; i++) {
            next = (curr + prev) % 10;
            prev = curr;
            curr = next;
        }


        out.println((prev));
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