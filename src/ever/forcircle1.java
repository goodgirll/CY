package ever;

import java.util.Scanner;

public class forcircle1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name1 = input.next();
        int i,sum;
        for (i = 1,sum = 0;i<6;i++){
            System.out.println("请输入第" + i + "门的成绩：");
            int score = input.nextInt();
             sum = sum + score;
        }
        int avg = sum/5;
        System.out.println(name1 + "的平均分是：" + avg);
    }
}
