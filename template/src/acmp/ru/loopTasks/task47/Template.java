package acmp.ru.loopTasks.task47;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int maxS=1;
        int bestD=1;
        for (int d = 2; d <= n; d++) {
            if(n%d==0){
                int t=d;
                int s=0;
                while(t>0){
                    s+=t%10;
                    t/=10;
                }
                if(s>maxS){
                    maxS=s;
                    bestD=d;
                }
            }
        }

        out.print(bestD);

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
