package shop;

import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class Replacement1 {
    public static void main(String[] args) {
        System.out.println("请输入消费金额：");
        Scanner scan = new Scanner(System.in);
        double S = scan.nextInt();
        if (S>=50) {
            System.out.println("是否参加优惠换购活动： \n1：满50元，加2元换购百事可乐1瓶 \n2：满100元，加3元换购500ml可乐一瓶" +
                    " \n3：满100元，加10元换购5公斤面粉 \n4：满200元，加10元可换购1个苏波尔炒菜锅 \n5：满200元，加20元可换购欧莱雅爽肤水一瓶" +
                    " \n0：不换购 \n请选择：");
            int choose = scan.nextInt();
            switch (choose) {
                case 1: S = S + 2;
                    System.out.println("成功换购百事可乐一瓶！"); System.out.println("本次消费总金额：" + S);
                    break;
                case 2: S = S + 3;
                    System.out.println("成功换购500ml可乐一瓶！"); System.out.println("本次消费总金额：" + S);
                    break;
                case 3: S = S + 10;
                    System.out.println("成功换购5公斤面粉！"); System.out.println("本次消费总金额：" + S);
                    break;
                case 4: S = S + 10;
                    System.out.println("成功换购1个苏波尔炒菜锅！"); System.out.println("本次消费总金额：" + S);
                    break;
                case 5: S = S + 20;
                    System.out.println("成功换购欧莱雅爽肤水一瓶！"); System.out.println("本次消费总金额：" + S);
                    break;
                default:
                    System.out.println("未换购！！！"); System.out.println("本次消费总金额：" + S);
                    break;
            }
        }else {
            System.out.println("本次消费总金额：" + S);
            System.out.println("您消费不足50元无法参加换购活动！");
        }

    }
}
