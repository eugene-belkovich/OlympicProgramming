package acmp.ru.loopTasks.task1125;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        long n = in.nextInt();
        long i = 1;
        out.print(i*i + " ");
        while(n > i*i) {
            i++;
            if((i+1)*(i+1) > n) {
                out.print(i*i);
                break;
            } else {
                out.print(i*i + " ");
            }
        }
    }

    void run() {
        try (Scanner in = new Scanner(System.in);
             PrintWriter out = new PrintWriter(System.out)) {

            solve(in, out);
        }

    }

    public static void main(String[] args) {
        new Template().run();
    }
}