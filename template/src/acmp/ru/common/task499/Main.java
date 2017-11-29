package acmp.ru.common.task499;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int w = in.nextInt();
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        if(
                a1<=w && b1>=k ||
                a2<=w && b2>=k ||
                a3<=w && b3>=k ||
                a1+a2<=w && b1+b2>=k ||
                a2+a3<=w && b2+b3>=k ||
                a1+a3<=w && b1+b3>=k ||
                a1+a2+a3<=w && b1+b2+b3>=k
                ){
            out.println("YES");
        } else {
            out.println("NO");

        }

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