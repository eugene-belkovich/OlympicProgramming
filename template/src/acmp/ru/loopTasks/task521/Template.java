package acmp.ru.loopTasks.task521;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int h1 = in.nextInt();
        int m1 = in.nextInt();
        int h2 = in.nextInt();
        int m2 = in.nextInt();

        int dm1 = h1*60 + m1;
        int dm2 = h2*60 + m2;

        int count = 0;
        if (dm1 < dm2) {
            while (dm1 < dm2) {
                if (dm1 % 60 == 0) {
                    count += dm1/60;
                } else if (dm1 % 30 == 0) {
                    count += 1;
                }
                dm1++;
            }
        } else if (dm1 > dm2) {
            while (dm1 != dm2) {
                if (dm1 % 60 == 0) {
                    count += dm1/60;
                } else if (dm1 % 30 == 0) {
                    count += 1;
                }
                dm1++;
                if (dm1 == 720) {
                    dm1 = 0;
                }
            }
        }


        out.println(count);
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