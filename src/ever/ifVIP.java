package ever;

import java.util.Scanner;

public class ifVIP {
    public static void main(String[] args) {
        System.out.println("请输入是否是会员：是（Y）/否（N）");
        Scanner scan1 = new Scanner(System.in);
        String a = scan1.next(); //a为输入的Y/N
        if (a.equals("Y")){
            System.out.println("请输入购物金额：");
            Scanner scan2 = new Scanner(System.in);
            double z1 = scan2.nextDouble(); //Z为购物金额
            double Z =z1;
            if (Z>=200){
               Double R = Z*0.75; //未满200实际支付
                System.out.println("实际支付："+R);
            }else{
                double r1 = Z*0.8; //满200实际支付
                System.out.println("实际支付："+r1);
            }
        }else if(a.equals("N")){
            System.out.println("请输入购物金额：");
            Scanner scan3 = new Scanner(System.in);
            double z2 = scan3.nextDouble();
            double r2=z2;
            if (r2>=100){
               double R2 = r2*0.9; //满100实际支付
                System.out.println("实际支付："+R2);
            }else{
                System.out.println("实际支付："+r2);
            }

        }

    }
}
