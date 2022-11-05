package Math1;

import java.util.Scanner;

public class calculate1 {
    public static void main(String[] args) {
        cal1();
        cal2();
        cal3();
        cal4();
    }
    static void cal1(){
        int sum1 = 0;
        int i = 1;
        for (i=1;i<=100;i++) {
            if (i%2!=0){
                sum1 += i;
            }
        }
        System.out.println("100内奇数和为:" + sum1);
    }
    static void cal2(){
        int i;
        int Z; int t = 1;
        System.out.println("100以内的素数为：");
        for (Z=2;Z<=100;Z++){
            for (i=2;i<=Z;i++){
                if (Z%i==0){
                    break;
                }
            }
            if(Z==i){
                if(t%5!=0){
                    System.out.print(Z+",");
                }else {
                System.out.println(Z);
                }t++;
            }
        }
    }
    static void cal3(){
        Scanner scan1 = new Scanner(System.in);
        int Max_Num = 0;
        int Min_Num = 0;
        System.out.println("请输入一批整数（输入到0时结束,中间不要插入“0”）：");
        int num = scan1.nextInt();
        int L = 0;
        while (num!=0){
            if (Max_Num<=num){
                Max_Num=num;
            }
            if (L<num){
                Min_Num = L;
            }else{L = num;
            }
             num = scan1.nextInt();
        }
        System.out.println("最大值为：" + Max_Num +"\t最小值为：" + Min_Num);
    }
    static void cal4(){
        System.out.println("*1000以内的水仙花数：");
        for (int i = 1; i <=999; i++) {
            int a = i%10;//个位
            int b = i/10%10;//十位
            int c = i/100; //百位
            if(i == a*a*a+b*b*b+c*c*c) {
                System.out.print(i+" ");
            }
        }
    }

}
