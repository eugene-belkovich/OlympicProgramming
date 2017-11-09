package acmp.ru.tasks.task4;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int b = 9 - a;
        out.println(Integer.parseInt(a + "9" + b));
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
