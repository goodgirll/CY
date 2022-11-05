package ever;

import java.util.Scanner;

public class VIP1 {
    public static void main(String[] args) {
        System.out.println("请输入会员号（四位整数）：");
        Scanner V = new Scanner(System.in);
        int num = V.nextInt();
        if(num<=999||num>=10000) {
            System.out.println("客户号"+num+"是无效会员号！\n"+"录入信息失败！");
        }else {
            System.out.println("请输入会员生日(月/日<用两位数表示>)：");
            Scanner B=new Scanner(System.in);
            String bir= B.next();

            System.out.println("请输入积分：");
            Scanner F=new Scanner(System.in);
            int f= F.nextInt();

            System.out.println("已录入的会员信息是：\n"+num+"\t"+bir+"\t"+f);
        }
    }

}
