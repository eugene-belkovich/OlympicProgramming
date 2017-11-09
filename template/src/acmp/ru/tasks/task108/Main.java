package acmp.ru.tasks.task108;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        out.println(in.nextInt());
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
