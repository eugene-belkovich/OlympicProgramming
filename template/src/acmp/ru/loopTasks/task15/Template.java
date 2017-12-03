package acmp.ru.loopTasks.task15;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int a = in.nextInt();
        int [][] map = new int [a][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                int ij = in.nextInt();
                map[i][j] = ij;
            }
        }

        int count = 0;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (map[i][j] == 1 && map[j][i] == 1) {
                    count++;
                }
            }
        }
        out.println(count/2);
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