package acmp.ru.loopTasks.task376;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int birthDay = in.nextInt();
        int birthMonth = in.nextInt();
        int birthYear = in.nextInt();
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        int count = 0;
        while (!(day == birthDay && month == birthMonth)) {
            int dif;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                dif = 29;
            } else {
                dif = 28;
            }
            int din;
            if (month == 2) {
                din = dif;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                din = 30;
            } else {
                din = 31;
            }
            if (day == 31 && month ==12){
                day = 1;
                month = 1;
                year++;
            } else if (day == din) {
                day = 1;
                month++;
            } else {
                day++;
            }
            count++;
        }
        out.print(count);
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