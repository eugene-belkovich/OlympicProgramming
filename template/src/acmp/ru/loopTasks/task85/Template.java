package acmp.ru.loopTasks.task85;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = in.nextInt();
        while( b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        for (int i = 0; i < a; i++) {
            out.print(1);
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