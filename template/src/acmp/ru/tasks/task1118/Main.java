package acmp.ru.tasks.task1118;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int h = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int s1 = h - b;
        int s2 = a - b;
        out.println(Math.max((s1+s2-1)/s2, 1));
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