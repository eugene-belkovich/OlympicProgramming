package acmp.ru.loopTasks.task496;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int max = 0;
        int prev = in.nextInt();
        int a1=prev;
        int curr = in.nextInt();
        int a2=curr;
        for (int i = 2; i < n; i++) {
            int next = in.nextInt();
            max = Math.max(max, prev+curr+next);
            prev =curr;
            curr=next;
        }

        max = Math.max(max, prev+curr+a1);
        max = Math.max(max, curr+a1+a2);

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