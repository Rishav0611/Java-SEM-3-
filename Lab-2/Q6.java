public class Q6 {
    public static void main(String[] args) {
        int age=28;
        int montlyIncome=45000;
        int creditScore=720;

        if(age>=21 && age<=60 && montlyIncome>=20000 && creditScore>=650){
            System.out.println("Loan Approved ");
        }
        else{
            System.out.println("Loan Denaid");
        }

        int Maximum;

        Maximum=30*montlyIncome;

        System.out.println("Maximum Loan Amount: "+Maximum);
    }
}
