package elseplay1;

import java.util.Scanner;

public class pyramid1 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int i = input1.nextInt();
        int a,b,c;
        for (a=1;a<=i;a++){
            for (b=i-a;b>0;b--){
                System.out.print("  ");
            }
            for (c=a;c>=1;c--){
                System.out.print(c + " ");
            }
            for (c=2;c<=a;c++){
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
