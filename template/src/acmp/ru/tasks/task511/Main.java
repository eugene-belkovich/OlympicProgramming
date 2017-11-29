package acmp.ru.tasks.task511;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int m = in.nextInt();
        int g = in.nextInt();
        int r = in.nextInt();

        if (g<=m) {
            out.println("1");
        } else if (g-m+r>=g){
            out.println("NO");
        } else {
            int a1 = g;
            int an = g-m;
            int dif = g - (g-m+r);
            out.println(a1-an/dif+1);
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