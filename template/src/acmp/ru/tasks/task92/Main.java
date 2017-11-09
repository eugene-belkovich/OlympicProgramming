package acmp.ru.tasks.task92;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    void solve(Scanner in, PrintWriter out) {
        int S = in.nextInt();
        int partOfWork= S / 6;
        out.println(partOfWork + " " + partOfWork * 4 + " " + partOfWork);
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
