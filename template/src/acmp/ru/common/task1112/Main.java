package acmp.ru.common.task1112;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int i3 = n%10;
        int i2 = ((n-i3)%100)/10;
        int i1 = ((n-i3-i2)%1000)/100;

        out.println(i1+i2+i3);
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