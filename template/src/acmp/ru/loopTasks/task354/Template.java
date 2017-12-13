package acmp.ru.loopTasks.task354;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int div = 2;
        String res = "";
        while (n > 1 || div < n) {
            if ( n % div == 0) {
                if (res.length() != 0) {
                    out.print("*");
                }
                res += div;
                out.print(div);
                n /= div;
            } else {
                div++;
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