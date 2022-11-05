package elseplay1;

import java.util.Scanner;

public class calendar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year1 = input.nextInt();
        System.out.println("请输入"+ year1 +"年1月1日为星期几");
        System.out.println("0.星期日\t1.星期一\t2.星期二\t3.星期三\t4.星期四\t5.星期五\t6.星期六");
        int day1 = input.nextInt();

    }
}
