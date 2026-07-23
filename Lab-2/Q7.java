public class Q7 {
    public static void main(String[] args) {
        double billAmount=1200;
        boolean hasCoupon=true;
        double finalAmount=0;

        if(billAmount>500 && billAmount<1000 ){
            finalAmount=0;
        }
        else if(billAmount>1000){
            System.out.println("Base Discount = 20%");
            finalAmount=billAmount-(billAmount*0.2);
        }

        if(hasCoupon){

            billAmount=finalAmount-(billAmount*0.05);
            System.out.println("Coupon= 5%");
        }

        finalAmount=billAmount;

        System.out.println("Final amount: "+ (int)finalAmount);
    }
}
