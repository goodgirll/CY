package array1;

import java.util.Scanner;

public class arraydemo1 {
    public static void main(String[] args) {

        test1();
        test2();
        test3();
        test4();
    }
    public static void test1(){ //求最大值最小值
        System.out.println("请输入一组数：");
        Scanner input = new Scanner(System.in);
        int a[] = {input.nextInt()};
        int max=0;
        for(int i=1;i<a.length;i++){
            if (a[i]>max){
                max=a[i];
        }
        }
        System.out.println("最大值为：" + max);
    }
    static void test2(){

    }
    static void test3(){

    }
    static void test4(){

    }
}
