package acmp.ru.loopTasks.task131;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int max = 0;
        int index = 0;
        for (int i = 0; i < n; i ++) {
            int v = in.nextInt();
            int s = in.nextInt();
            if (s == 1 && v >= max) {
                max = v;
                index = i + 1;
            }
        }
        out.println(index);
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