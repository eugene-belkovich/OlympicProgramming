package acmp.ru.loopTasks.task14;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int scale = in.nextInt();
        int p = 1;
        int s = 0;
        while( n != 0) {
            int last = n % scale;
            p *= last;
            s += last;
            n /= scale;
        }
        out.print(p - s);
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