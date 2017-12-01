package acmp.ru.loopTasks.task35;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        for (int i = 0; i < k; i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            out.println(19*m+(n+239)*(n+366)/2);
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
