
 import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter no. here: ");
        int n=sc.nextInt();

        int reverse=0;
        int orignal=n;

        while (n!=0) {
            int last=n%10;
            reverse=reverse*10+last;
            n=n/10; 
        }

        System.out.println("Reverse no is: "+reverse);


        if(orignal==reverse){
           System.out.print("The no. is Palindrone: ");
        }
        else{
           System.out.print("The no. is not: ");
        }
        sc.close();
    }

}


