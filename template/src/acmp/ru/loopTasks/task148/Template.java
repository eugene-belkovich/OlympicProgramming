package acmp.ru.loopTasks.task148;

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
        out.println(a);
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
