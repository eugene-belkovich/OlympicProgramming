package acmp.ru.common.task62;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        long N1 = in.nextLong();
        long N2 = in.nextLong();
        long N3 = in.nextLong();
        long N4 = in.nextLong();
        long N5 = in.nextLong();
        long N6 = in.nextLong();
        long N7 = in.nextLong();
        long N8 = in.nextLong();
        long s1 = N1+N2+N3+N4;
        long s2 = N5+N6+N7+N8;

        if(s1>s2){
            out.println("1");
        } else if (s1<s2) {
            out.println("2");
        } else {
            out.println("DRAW");
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