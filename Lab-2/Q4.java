public class Q4 {
    public static void main(String[] args) {
        int annullncome=850000;

        int tax=0;

        if(annullncome<=250000){
            tax=0;
        }
        else if(annullncome<=500000){
            tax=annullncome*5/100;
        }
        else if(annullncome<=1000000){
            tax=annullncome*20/100;
        }
        else{
            tax=annullncome*30/100;
        }
        int Health=tax*4/100;
        int Total=tax+Health;

        System.out.println("Tax: "+tax);
        System.out.println("Health: "+Health);
        System.out.println("Total: "+Total);
    }
}
