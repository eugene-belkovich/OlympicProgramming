package acmp.ru.loopTasks.task383;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int n = in.nextInt();
        int maxS=1;
        int bestD=1;
        int c1=0;
        int d =0;
        while(c1<n){
            d++;
            int t=d;
            int s=0;
            int c=0;
            while(t>0){
                s+=t%10;
                t/=10;
                c++;
            }

            if(s%c==0){
                c1++;
                bestD=d;
            }
        }


        out.print(d);
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