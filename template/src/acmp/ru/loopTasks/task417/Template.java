package acmp.ru.loopTasks.task417;

import java.io.PrintWriter;
import java.util.Scanner;

public class Template {

    void solve(Scanner in, PrintWriter out) {
        int nDays = in.nextInt();
        int weekDay = 2;
        int day = 1;
        int month = 1;
        int year = 2008;
        for (int i = 0; i < nDays; i++) {
            int daysInFebruary;
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                daysInFebruary = 29;
            } else {
                daysInFebruary = 28;
            }
            int daysInMonth;
            if (month == 2) {
                daysInMonth = daysInFebruary;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else {
                daysInMonth = 31;
            }
            if (day == 31 && month == 12) {
                day = 1;
                month = 1;
                year++;
            } else if (day == daysInMonth){
                day = 1;
                month++;
            } else {
                day++;
            }
            if (weekDay < 7) {
                weekDay++;
            } else {
                weekDay = 1;
            }
        }
        //Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday.
        if (weekDay == 1) {
            out.print("Monday");
        } else if (weekDay == 2){
            out.print("Tuesday");
        } else if (weekDay == 3){
            out.print("Wednesday");
        } else if (weekDay == 4){
            out.print("Thursday");
        } else if (weekDay == 5){
            out.print("Friday");
        } else if (weekDay == 6){
            out.print("Saturday");
        } else if (weekDay == 7){
            out.print("Sunday");
        }
        out.print(", " + day/10 + day%10 + "." + month/10 + month%10);
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