import java.util.Scanner;

public class NumberGuessinginRange {
   public NumberGuessinginRange() {
   }

   public static void main(String[] var0) {
      byte var1 = 27;
      Scanner var2 = new Scanner(System.in);

      for(int var3 = 0; var3 < 5; ++var3) {
         int var4 = var2.nextInt();
         if (var4 == var1) {
            System.out.println("Congrats You Guessed it Right!");
            break;
         }

         if (var4 > var1) {
            System.out.println("Too High!");
         } else if (var4 < var1) {
            System.out.println("Too Low!");
         } else {
            System.out.println("Better Luck Next Time!");
         }
      }

   }
}
