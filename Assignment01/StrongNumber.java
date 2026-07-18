import java.util.*;
public class StrongNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=n;i<=m;i++){
            int sum =0;
            int temp = i;
            while(temp>0){
                int digit = temp%10;
                int fact = 1;
                for(int j=1;j<=digit;j++){
                    fact=fact*j;
                }
                sum+=fact;
                temp/=10;
            }
            if(sum == i){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
