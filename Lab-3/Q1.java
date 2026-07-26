import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

         System.out.print("Enter no.: ");
         int no = sc.nextInt();

         for(int i=1 ; i<=no ; i++){
            System.out.print(" "+i);
         }

         sc.close();
    }
}
