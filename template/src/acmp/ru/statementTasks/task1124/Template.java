package acmp.ru.statementTasks.task1124;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        if( x1 == x2 && ((y1 == 2 && y2 == y1 +2)|| (y1 >= 2 && y2 == y1 +1))) {
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