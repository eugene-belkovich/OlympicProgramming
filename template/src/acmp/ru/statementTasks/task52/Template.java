package acmp.ru.statementTasks.task52;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     * lucky ticket
     *
     * */

    void solve(Scanner in, PrintWriter out) {
        int x = in.nextInt();
        int a6 = x % 10;
        int a5 = x % 100 / 10;
        int a4 = x % 1000 / 100 ;
        int a3 = x % 10000 / 1000;
        int a2 = x % 100000 / 10000;
        int a1 = x % 1000000 / 100000;

        if(a1+a2+a3==a4+a5+a6){
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