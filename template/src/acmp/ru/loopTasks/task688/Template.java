package acmp.ru.loopTasks.task688;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        long xs = in.nextInt();
        long ys = in.nextInt();
        long xd = in.nextInt();
        long yd = in.nextInt();
        long n = in.nextInt();
        long ts = 0;
        long td = 0;
        for (int i = 0; i < n; i++) {
            int xn = in.nextInt();
            int yn = in.nextInt();
            ts = ((xn - xs)*(xn - xs) + (yn - ys)*(yn - ys)) * 4;
            td = ((xn - xd)*(xn - xd) + (yn - yd)*(yn - yd));
            if (td <= ts) {
                out.println(i+1);
                return;
            }
        }

        out.println("NO");
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