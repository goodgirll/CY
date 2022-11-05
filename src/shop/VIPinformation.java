package shop;

import java.util.Scanner;

public class VIPinformation {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        int i;
        for(i=1;i<=3;i++) {
            System.out.println("请输入会员号(<四位整数>):");
            int V = input1.nextInt();
            System.out.println("请输入会员生日(月/日<用两位整数表示>):");
            String bir = input1.next();
            System.out.println("请输入会员积分:");
            int cre = input1.nextInt();
            if (V<=999||V>=10000){
                System.out.println("客户号" + V +"是无效会员号！\n录入信息失败\n");
                continue;
            }
            System.out.println("您录入的会员信息是:\n" + V + "\t" + bir + "\t" + cre + "\n");
            }
    }
}
