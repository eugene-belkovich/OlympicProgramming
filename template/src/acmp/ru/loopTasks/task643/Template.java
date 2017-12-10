package acmp.ru.loopTasks.task643;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        long n = in.nextInt();
        long old = n;
        int count = 0;
        while (n != 0) {
            long d = n % 2;
            if (d == 1) count ++;
            n /= 2;
        }
        out.println(old+count);
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