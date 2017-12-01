package acmp.ru.statementTasks.task316;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        if (n%107<=7){
            out.println(n / 107 * 100 + " " + n / 107 * 7);
        } else {
            out.println((n / 107 * 100) + (n % 107 - 7) + " " + (n / 107 * 7 + 7));

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