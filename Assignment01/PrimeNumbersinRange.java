import java.util.*;
public class PrimeNumbersinRange  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean isprime;
        for(int i=n;i<=m;i++){
            isprime = true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    isprime = false;
                    break;
                }
            }
            if(isprime){
                System.out.println(i);
            }
            
        }
    }
}
