package acmp.ru.tasks.task554;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        long n = in.nextLong();
        long a1 = 2;
        long an = 2 << (n+1-1);


        out.println((2+(2 << (n-1)))*n/2);
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