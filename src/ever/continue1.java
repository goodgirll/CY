package ever;

public class continue1 {
    public static void main(String[] args) {
        int a = 0;
        for (int i=1;i<=10;i++){
            if(i%2!=0){
                continue;
            }
            a += i;
        }
        System.out.println(a);
    }
}
