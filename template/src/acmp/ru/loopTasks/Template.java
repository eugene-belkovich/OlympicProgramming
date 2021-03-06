package acmp.ru.loopTasks;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int s = 0;

        while(n>0){
            s += n % 10;
            n /= 10;
        }
        out.println(s);
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
