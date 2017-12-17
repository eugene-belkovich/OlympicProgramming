package acmp.ru.loopTasks.task398;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    private int count=0;

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        for (int a = 1; a *4<= n; a++) {
            for (int b = a; a+3*b <= n; b++) {
                for (int c = b; c*2+a+b <= n; c++) {
                    int d = n-a-b-c;
                    if (a + b + c + d == n) {
                        count++;
                    }
                }

            }
        }
        out.print(count);

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