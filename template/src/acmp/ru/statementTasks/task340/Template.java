package acmp.ru.statementTasks.task340;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    /*
     *
     * */

    void solve(Scanner in, PrintWriter out) {
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        int c1 = in.nextInt();
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        int c2 = in.nextInt();

        if( a1==a2 && b1==b2 && c1 == c2 ||
                a1==a2 && b1==c2 && c1 == b2 ||
                a1==b2 && b1==a2 && c1 == c2 ||
                a1==b2 && b1==c2 && c1 == a2 ||
                a1==c2 && b1==a2 && c1 == b2 ||
                a1==c2 && b1==b2 && c1 == a2
                ){
            out.println("Boxes are equal");
        } else if( a1<=a2 && b1<=b2 && c1 <= c2 ||
                a1<=a2 && b1<=c2 && c1 <= b2 ||
                a1<=b2 && b1<=a2 && c1 <= c2 ||
                a1<=b2 && b1<=c2 && c1 <= a2 ||
                a1<=c2 && b1<=a2 && c1 <= b2 ||
                a1<=c2 && b1<=b2 && c1 <= a2
                ){
            out.println("The first box is smaller than the second one");
        } else if( a1>=a2 && b1>=b2 && c1 >= c2 ||
                a1>=a2 && b1>=c2 && c1 >= b2 ||
                a1>=b2 && b1>=a2 && c1 >= c2 ||
                a1>=b2 && b1>=c2 && c1 >= a2 ||
                a1>=c2 && b1>=a2 && c1 >= b2 ||
                a1>=c2 && b1>=b2 && c1 >= a2
                ){
            out.println("The first box is larger than the second one");
        } else {
            out.println("Boxes are incomparable");
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