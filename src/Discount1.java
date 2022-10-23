import java.util.Scanner;

public class Discount1 {
    public static void main(String[] args) {
        System.out.println("请输入会员积分：");
        Scanner scan1 = new Scanner(System.in);
        double x = scan1.nextDouble();
        if (x<2000){
            System.out.println("该会员享受的折扣是：0.9");
        }else if (x<4000){
            System.out.println("该会员享受的折扣是：0.9");
        }else if (x<8000){
            System.out.println("该会员享受的折扣是：0.7");
        }else {
            System.out.println("该会员享受的折扣是：0.6");
        }

    }
}
