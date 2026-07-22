public class Q3 {
    public static void main(String[] args) {
        int previousReading=1200;
        int  currentReading=1450;

        int unit=currentReading-previousReading;

        int Total=0;
        if(unit<=100){
            Total=unit*3;
        }
        else if(unit<=200){
            Total=(100*3)+(unit-100)*5;
        }
        else{
            Total=(100*3)+(100*5)+(unit-200)*8;
        }
        Total+=50;

        System.out.println("Units Consumed: "+unit);
        System.out.println("Total Bill: "+Total);
    }
}
