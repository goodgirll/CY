package shop;

import java.util.Scanner;

public class someday1 {
    public static void main(String[] args) {
        while (true) {
        System.out.println("Enter year (e.g., 2012) :");
        Scanner scan1 = new Scanner(System.in);
        int year = scan1.nextInt(); //年份
        System.out.println("Enter month (1-12) :");
        int m = scan1.nextInt(); //月份
        switch (m) {
            case 1:
                m = 13;
                year = year - 1;
                break;
            case 2:
                m = 14;
                year = year - 1;
                break;
        } //1，2月分重新分配变量

        System.out.println("Enter the day of the month (1-31) :");
        int q = scan1.nextInt(); //某月第几天

        int j = year / 100; //j为世纪数
        int k = year % 100; //该世纪的第几年

        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7; //一个星期的某一天
        switch (h) {
            case 0:
                System.out.println("Day of the week is " + "Saturday");
                break;
            case 1:
                System.out.println("Day of the week is " + "Sunday");
                break;
            case 2:
                System.out.println("Day of the week is " + "Monday");
                break;
            case 3:
                System.out.println("Day of the week is " + "Tuesday");
                break;
            case 4:
                System.out.println("Day of the week is " + "Wednesday");
                break;
            case 5:
                System.out.println("Day of the week is " + "Thursday");
                break;
            case 6:
                System.out.println("Day of the week is " + "Friday");
                break;
        }
    }//循环


    }
}
