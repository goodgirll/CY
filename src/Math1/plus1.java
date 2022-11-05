package Math1;

import java.util.Random;
import java.util.Scanner;

public class plus1 {
    public static void main(String[] args) {
        int n=0;
        String t[]=new String[5];
        long start=System.currentTimeMillis();
        for (int i=0;i<5;i++){
            Random random=new Random();
            int a=random.nextInt(100);
            int b=random.nextInt(100);
            int c=a+b;
            System.out.println(a+"+"+b+"=");
            Scanner sc=new Scanner(System.in);
            int d=sc.nextInt();
            if (c==d){
                n++;
                t[i]=""+a+"+"+b+"="+c+"             correct" ;
            }
            else {
                t[i]=""+a+"+"+b+"="+c+"             wrong" ;
            }
        }
        long end=System.currentTimeMillis();
        long time=(end-start)/1000;
        System.out.println("您花了"+time+"秒做题，答对"+n+"道题目");
        for(int i=0;i<t.length;i++){
            System.out.println(t[i]);
        }

    }
}
