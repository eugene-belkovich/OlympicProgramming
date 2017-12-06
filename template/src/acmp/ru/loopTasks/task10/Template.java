package acmp.ru.loopTasks.task10;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        for (int i = 0; i <= 100; i++) {
            if (a*i*i*i + b*i*i + c*i + d == 0) {
                out.println(i);
            }
            if (i != 0 && a*(-i)*(-i)*(-i) + b*(-i)*(-i) + c*(-i) + d == 0) {
                out.println(-i);
            }
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