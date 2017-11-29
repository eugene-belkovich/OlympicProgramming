package acmp.ru.tasks.task8;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        long N1 = in.nextLong();
        long N2 = in.nextLong();
        long N3 = in.nextLong();

        if(N1+N2 == N3){
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