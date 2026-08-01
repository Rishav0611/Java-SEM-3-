import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. of Rows: ");
        int n=sc.nextInt();

        for(int i=1 ; i<=n ; i++){
            System.out.println("");
            for(int s=1 ; s<=i ; s++){
                System.out.print("*");
            }
        }
        sc.close();
    }
}
