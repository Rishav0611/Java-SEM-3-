public class Q8 {
    public static void main(String[] args) {
        double usdAmount = 100;
        double exchangeRate = 83.50;

        double Result = usdAmount * exchangeRate;
        int dResult = (int) Result;
        double loss = dResult - Result;

        System.out.println("double result = " + dResult + ", int result = " + Result + " (truncated), Loss = " + loss);
    }
}