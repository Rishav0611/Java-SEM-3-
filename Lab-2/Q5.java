public class Q5 {
    public static void main(String[] args) {
        int balance=25000;
        int withdraw=5000;

        if(balance>withdraw && withdraw % 100==0 && (balance-withdraw)>=1000){
            System.out.println("Transaction Successful!!");
        }
        else{
            System.out.println("Transaction Failed!!");
        }
        System.out.println("Remaining Balance: "+balance);
    }
}
