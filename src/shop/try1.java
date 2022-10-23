package shop;

import java.util.Scanner;

public class try1 {
    public static void main(String[] args) {
        System.out.println("请输入数字：");
        Scanner scan1 = new Scanner(System.in);
        int a = scan1.nextInt();
        a = a+1;
        System.out.println("输出"+ a);

    }
}
