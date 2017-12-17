package acmp.ru.loopTasks.task63;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int s = in.nextInt();
        int p = in.nextInt();
        int x;
        int y;
        for (int i = 1; i < s - 1; i++) {
            for (int j = 1; j < s-1; j++) {
                if(i+j==s && i*j==p && i<=j){
                    out.print(i+" ");
                    out.print(j);
                }
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