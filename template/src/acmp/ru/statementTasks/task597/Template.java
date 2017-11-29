package acmp.ru.statementTasks.task597;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     * r3 > r2 + r1
     * r3 < r2 + r1
     * r3 == r2 + r1
     * */

    void solve(Scanner in, PrintWriter out) {
        int r1 = in.nextInt();
        int r2 = in.nextInt();
        int r3 = in.nextInt();
        if(r1 >= r2+r3) {
            out.println("YES");
        } else {
            out.println("NO");
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
