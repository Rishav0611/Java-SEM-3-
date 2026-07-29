import java.util.Scanner;
public class Q4 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. here: ");
        int n=sc.nextInt();

        int reverse=0;

        while (n!=0) {
            int last=n%10;
            reverse=reverse*10+last;
            n=n/10; 
        }

        System.out.println("Reverse no is: "+reverse);

        sc.close();
    }

}
