package acmp.ru.tasks.task1109;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int N = in.nextInt();
        out.println("The next number for the number " + N + " is " +  (N + 1) + ".");
        out.println("The previous number for the number " + N + " is " +  (N - 1) + ".");
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