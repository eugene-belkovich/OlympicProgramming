package acmp.ru.common.task697;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int l = in.nextInt();
        int w = in.nextInt();
        int h = in.nextInt();
        int r = (2*(l*h + w*h) + 16 - 1) / 16;
        out.println(r);
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