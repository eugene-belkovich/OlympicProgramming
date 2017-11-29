package acmp.ru.common.task1116;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int s1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();
        int s2 = in.nextInt();

        out.println((h2*3600+m2*60+s2)-(h1*3600+m1*60+s1));
    }
    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {
            solve(in, out);
        }
    }
    public static void main(String[] args) {
        new Main().run();
    }
}