package acmp.ru.statementTasks.task324;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     * polindrom
     * xyyx
     * yxxy
     * */

    void solve(Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int a4 = x % 10;
        int a3 = x % 100 / 10;
        int a2 = x % 1000 / 100 ;
        int a1 = x % 10000 / 1000;

        if(a1==a4 && a2==a3){
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