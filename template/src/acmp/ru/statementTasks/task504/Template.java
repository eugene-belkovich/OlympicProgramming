package acmp.ru.statementTasks.task504;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
    /* 0 gcv
     * 1 gvc
     *   vgc
     * 2 vcg
     *   cvg
     * 3 cgv
     *   gcv
     *
     * */

    void solve(Scanner in, PrintWriter out) {
        int x = in.nextInt();

        if(x%3==0 || x==0){
            out.println("GCV");
        } else if (x%3==2){
            out.println("CVG");
        } else if (x%3==1){
            out.println("VGC");
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