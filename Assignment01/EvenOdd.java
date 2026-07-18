import java.util.*;

public class EvenOdd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=1;i<=s;i++){
            if(i%2==0){
                System.out.println(i+" -> even");
            }else{
                System.out.println(i+" -> odd");
            }
        }
    }
}
