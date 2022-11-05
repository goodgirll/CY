package ever;

public class try2 {
    public static void main(String[] args) {
        int sum2 = 0;
        int i = 0;
        int j = 0;
        for (i=2;i<=100;i++){
            for (j=2;j<i;j++){
                if (i%j==0){
                    break;
                }
            }
            if (j==i){
                sum2 += i;
            }
        }System.out.println("100以内的素数和为：" + sum2);

    }
}
