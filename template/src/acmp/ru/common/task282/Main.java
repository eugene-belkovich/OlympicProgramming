package acmp.ru.common.task282;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        long Nx = in.nextLong();
        long Ny = in.nextLong();
        long Nz = in.nextLong();

        int k = 3;


        out.println(k*Nx + Ny*(k+2) + Nz * (k+2+7));
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