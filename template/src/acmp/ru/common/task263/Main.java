package acmp.ru.common.task263;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int i = in.nextInt();
        int j = in.nextInt();
        int s1 = Math.max(j,i)-Math.min(i,j)-1;
        int s2 = n-Math.max(j,i)+Math.min(i,j)-1;
        out.println(Math.min(s1, s2));
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