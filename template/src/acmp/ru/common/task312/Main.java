package acmp.ru.common.task312;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int N = in.nextInt();
        out.println((N-1)*(a2-a1)+a1);
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