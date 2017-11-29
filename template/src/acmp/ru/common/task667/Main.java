package acmp.ru.common.task667;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int d = in.nextInt();
        int v = in.nextInt();
        int e = in.nextInt();

        int kuci = v / 2;

        if(v % 2 != 0){
            out.println(0);
        } else if (d+v/e < kuci) {
            out.println(0);
        } else {
            out.println(d+v/e);
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