package acmp.ru.statementTasks.task970;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        long a1 = in.nextInt();
        long a2 = in.nextInt();
        long a3 = in.nextInt();
        if (a1 + a2 == a3) {
            out.print("YES");
        } else if (a2 + a3 == a1) {
            out.print("YES");
        } else if (a3 + a1 == a2) {
            out.print("YES");
        } else {
            out.print("NO");
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