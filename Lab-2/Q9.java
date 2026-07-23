public class Q9 {
    public static void main(String[] args) {
        int sensorValue=372;

       double Temperture=sensorValue/10.0;
        double sensor=(int)sensorValue;
        double loss=sensorValue-sensor;

        if(Temperture<35){
            System.err.println("LOW");
        }
        else if(Temperture>35&&Temperture<38){
            System.out.println("NORMAL");
        }
        else{
            System.out.println("HIGH");
        }
        sensor=sensor/10;

        System.out.println("Temperture: "+Temperture);
        System.out.println("Loss: "+loss);
        System.out.println("Stored Value: "+sensor);
    }
}
