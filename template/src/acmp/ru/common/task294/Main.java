package acmp.ru.common.task294;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int k1 = in.nextInt();
        int l1 = in.nextInt();
        int m1 = in.nextInt();
        int k2 = in.nextInt();
        int l2 = in.nextInt();
        int m2 = in.nextInt();

        int s1 = k1 * m1 + k2 * m2;
        int k3 = k1*(100-l1)/100;
        int k4 = k2*(100-l2)/100;

        int k5 = Math.min(k3,k4);

        int s2 = k5*m1+k5*m2;


        out.println(s1-s2);
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