package shop;

import java.util.Scanner;

public class MyShopping1 {
    public static void main(String[] args) {
        System.out.println("欢迎使用MyShopping管理系统\n\n**************" +
                "\n1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销\n" +
                "**************");
        Scanner scan1 = new Scanner(System.in);
        System.out.println("请选择,输入数字:");
        int a = scan1.nextInt();
        do {
            if (a == 1){
                System.out.println("执行客户信息管理");break;
            }else if (a == 2){
                System.out.println("执行购物结算");break;
            }else if (a == 3){
                System.out.println("执行真情回馈");break;
            }else if (a == 4){
                System.out.println("注销");break;
            }else {
                System.out.println("输入错误，请重新输入数字:");
                a = scan1.nextInt();
            }
        }while(a != (1 | 2 | 3 | 4));
    }
}