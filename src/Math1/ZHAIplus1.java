package Math1;

import java.util.Scanner;

public class ZHAIplus1 {
    public static void main(String[] args) {
            Scanner s2 = new Scanner(System.in);
            int a,a2,z;
            int count = 0;
            StringBuilder str2= new StringBuilder();
            for (int i = 0; i < 5; i++) {
                a = (int) (Math.random() * 10);
                a2 = (int) (Math.random() * 10);
                System.out.print(a + "+" + a2 + "=");
                z = s2.nextInt();
                String str1 =a + "+" + a2 + "="+z;
                if (z == (a + a2)) {
                    count++;
                    str2.append(str1).append(" correct").append("\n");
                } else {
                    str2.append(str1).append(" wrong").append("\n");
                }
            }
            System.out.println("您花了" + System.currentTimeMillis() + "毫秒做对了" + count + "道题");
            System.out.println(str2);
    }
}
