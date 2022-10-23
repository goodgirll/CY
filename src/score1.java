import java.util.Scanner;

public class score1 {
    public static void main(String[] args) {
        System.out.println("请输入你的分数：");
        Scanner score1 = new Scanner(System.in);
        int score = score1.nextInt();
        if (score>=90) {
            System.out.println("优秀");
        }else if (score>=80) {
            System.out.println("良好");
        }else if (score>=60) {
            System.out.println("中等");
        }else {
            System.out.println("差");
        }
    }
}
