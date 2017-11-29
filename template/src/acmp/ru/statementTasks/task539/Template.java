package acmp.ru.statementTasks.task539;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     * 2 host 1 slice
     * 3 host 3 slice
     * 4 host 2 slice
     * 5 host 5 slice
     * */

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        if(a==1) {
            out.println(0);
        } else if (a%2 == 0) {
            out.println(a/2);
        } else {
            out.println(a);
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
