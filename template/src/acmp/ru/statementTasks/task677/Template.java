package acmp.ru.statementTasks.task677;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     *
     * */

    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int d = in.nextInt();
        int c = d*k*m*n;
        int z = k*n*m - n*m - k*m - k*n;
        int x = c/z;

        if(x % k != 0 || x % m != 0 || x % n != 0 || z <= 0 || c % z != 0){
            out.println("-1");
        } else {
            out.println(x);
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