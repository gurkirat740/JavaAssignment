import java.util.*;

public class Multiplication {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        for(int i=0;i<=s;i++){
            for(int j=0;j<10;j++){
                System.out.println(i*j);
            }
            System.out.print("\n");
        }

    }
}
