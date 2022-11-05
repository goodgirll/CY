package ever;

import java.util.Scanner;

public class VIP2 {
    public static void main(String[] args) {
        System.out.println("请输入会员号（四位整数）：");
        Scanner V = new Scanner(System.in);
        int num = V.nextInt();
        int Luc = (num / 100) % 10; //取百位数
        int random1 = (int) (Math.random() * 10);
                do {
                    if ((num>999)&&(num<10000)){break;
                    }else{
                        System.out.println("请输入正确的四位数字!!!（请重新输入）");
                        num = V.nextInt();
                    }
                }while((num<=999)|(num>=10000));
                if (Luc == random1) {
                        System.out.println("客户号" + num + "是幸运用户，获精美MP3一个");
                    }else {
                        int L = random1;
                        System.out.println("幸运数为：" + L + "\t您未中奖！" + "\t谢谢您的支持！！！");
                    }
        }
    }

