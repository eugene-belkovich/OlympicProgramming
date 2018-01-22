package acmp.ru.statementTasks.task529;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        out.print(Math.sqrt(Math.pow((x2-x1), 2) - Math.pow((y2-y1), 2)));

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