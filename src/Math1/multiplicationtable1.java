package Math1;

public class multiplicationtable1 {
    public static void main(String[] args) {
        int a,b = 1;
        for (a=1;a<=9;a++){
            for (b=1;b<=a;b++){
                System.out.print(b + "*" + a + "=" + (b*a) + "\t");
            }
            System.out.println();
        }
    }
}
