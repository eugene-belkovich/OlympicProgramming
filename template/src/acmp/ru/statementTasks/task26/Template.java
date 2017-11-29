package acmp.ru.statementTasks.task26;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     *
     * */

    void solve(Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int r1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        int r2 = in.nextInt();
        int d = (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2);
        int d1 = (r1+r2) * (r1+r2);
        int d2 = (r1-r2) * (r1-r2);
        if(d2 <= d && d <= d1){
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