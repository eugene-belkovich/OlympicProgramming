package acmp.ru.loopTasks.task272;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int max4 = -10001;
        int minH4 = 10001;
        while (true) {
            if (in.hasNextInt()) {
                minH4 = Math.min(minH4, in.nextInt());
            } else {
                break;
            }
            if (in.hasNextInt()) {
                max4 = Math.max(max4, in.nextInt());
            } else {
                break;
            }
        }
        out.println(max4 + minH4);
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
