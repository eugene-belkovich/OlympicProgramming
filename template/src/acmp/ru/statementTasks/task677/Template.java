package acmp.ru.statementTasks.task677;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     *
     * */

    void solve(Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        if(){
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