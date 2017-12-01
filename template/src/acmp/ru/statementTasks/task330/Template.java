package acmp.ru.statementTasks.task330;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        if( Math.abs(x1-x2) == Math.abs(y1-y2) ) {
            out.println(1);
        } else if( (x1+x2+y1+y2) % 2 != 0 ) {
            out.println(0);
        } else {
            out.println(2);
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