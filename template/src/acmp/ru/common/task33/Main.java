package acmp.ru.common.task33;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        int gN = in.nextInt();
        int lN = in.nextInt();
        int bN = gN + lN - 1;
        out.println(bN - gN);
        out.println(bN - lN);
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
