import java.util.Scanner;

public class Q3 {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter no. here: ");
    long n=sc.nextLong();

    long r=1;
    for(int i=1 ; i<=n ; i++){
        r=r*i;
     
    }
       System.out.print(r+" ");

    sc.close();
   } 
}
