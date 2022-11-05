package Math1;

import java.util.Scanner;

public class plustable1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("请输入一个值：");
        int x1 = input1.nextInt();
        System.out.println("根据这个值可以输出以下加法表：");
        for(int i=0,j=x1;i<7;i++,j--){
            System.out.println(i + "+" + j + "=" + (i+j));
        }
    }
}
