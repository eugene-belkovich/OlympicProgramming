package acmp.ru.tasks.task685;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int d1 = in.nextInt();
        int d2 = in.nextInt();
        int d3 = in.nextInt();


        int e1 = in.nextInt();
        int e2 = in.nextInt();
        int e3 = in.nextInt();

        int dmin = Math.min(d3,Math.min(d1,d2));
        int dmax = Math.max(d3,Math.max(d1,d2));
        int dmid = d1+d2+d3-dmin-dmax;

        int emin = Math.min(e3,Math.min(e1,e2));
        int emax = Math.max(e3,Math.max(e1,e2));
        int emid = e1+e2+e3-emin-emax;


        out.println(dmax*emax+dmid*emid+dmin*emin);
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