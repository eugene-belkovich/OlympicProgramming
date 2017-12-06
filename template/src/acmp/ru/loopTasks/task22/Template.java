package acmp.ru.loopTasks.task22;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int d = 0;
        int count = 0;
        while(n != 0) {
            d = n % 2;
            if (d == 1) {
                count++;
            }
            n /= 2;
        }
        out.println(count);
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