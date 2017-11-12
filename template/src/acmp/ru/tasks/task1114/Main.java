package acmp.ru.tasks.task1114;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    void solve(Scanner in, PrintWriter out) {
        int v = in.nextInt();
        int t = in.nextInt();

        if(v>0){
            int l = v*t;
            if (l<109) {
                out.println(l+1);
            } else {
                out.println((l%109)+1);
            }
        } else {
            int l = v*t;
            if (l==-1) {
                out.println(109);
            } else if (l > -109){
                out.println(-109-1-l);
            } else {
                out.println((l%(109))-(l/(109)));
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
        new Main().run();
    }
}