package acmp.ru.tasks.task195;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        int sideA = in.nextInt();
        int sideB = in.nextInt();
        int N = in.nextInt();
        int sideCount = 2;


        out.println(sideCount * sideA * sideB * N);
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
