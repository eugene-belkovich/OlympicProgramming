package acmp.ru.common.task893;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {
    public static int factorial(int number) {
        int result = 1;

        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }

        return result;
    }

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int k = 3;
        int c1 = factorial(n) / factorial(k) * factorial(n-k);
        int c2 = factorial(n-1) / factorial(k-1) * factorial(n-k-2);
        int c3 = factorial(n-2) / factorial(k-2) * factorial(n-k-4);


        out.print(c1+c2+c3);

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