package acmp.ru.loopTasks.task106;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int k = in.nextInt();
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < k; i++) {
            int n = in.nextInt();
            if(n==0){
                count1++;
            }
            if(n==1){
                count2++;
            }
        }
        out.println(Math.min(count1,count2));
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
