package acmp.ru.common.task1114;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int v = in.nextInt();
        int t = in.nextInt();
        //(v*t) % 109 -> [1...109]
        //(v*t + 1) % 109 -> [0...108]
        //(v*t) % 109 + 1 -> [1...109]
        //((v*t) % 109 + 109 ) % 109 -> [0...108]
        //((v*t) % 109 + 109 ) % 109 + 1 -> [1...109]
        out.println(((v*t)%109+109)%109+1);
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