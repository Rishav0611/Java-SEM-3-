//public class Q10 {
  //  public static void main(String[] args) {
    //    double annualFees = 50000;

      //  checkEligibility(85, 90, "SC", annualFees);
        //checkEligibility(70, 85, "General", annualFees);
   // }

   // static void checkEligibility(int marks, double attendance, String category, double annualFees) {
       // if (marks >= 75 && attendance >= 80) {
         //   double percentage = 0;
           // if (category.equals("SC") || category.equals("ST")) {
             //   percentage = 100;
            //} else if (category.equals("OBC")) {
              //  percentage = 75;
            //} else if (category.equals("General")) {
              //  percentage = 50;
            //}

//            double scholarship = (percentage / 100) * annualFees;
  //          System.out.println("marks=" + marks + ", att=" + (int) attendance + ", cat=" + category + " -> Scholarship = " + (int) percentage + "% of fees (" + (int) scholarship + ")");
    //    } else {
      //      System.out.println("marks=" + marks + ", att=" + (int) attendance + ", cat=" + category + " -> Not Eligible ");
        //}
    //}
//}


public class Q10 {
    static double totalDisbursed = 0;

    public static void main(String[] args) {
        checkScholarship(85, 90, "SC", 250000);
        checkScholarship(70, 85, "General", 250000);
       

        System.out.println("Total Scholarship Disbursed = Rs." + (int) totalDisbursed);
    }

    static void checkScholarship(int marks, double attendance, String category, double familyIncome) {
        double annualFees = 50000;
        double percentage = 0;
        String result = "Not Eligible";

        if (marks >= 75 && attendance >= 80) {
            if (category.equals("General") && familyIncome > 300000) {
                result = "Not Eligible (Income too high)";
            } else {
                if (category.equals("SC") || category.equals("ST")) {
                    percentage = 100;
                } else if (category.equals("OBC")) {
                    percentage = 75;
                } else {
                    percentage = 50;
                }
                result = "Full";
            }
        } else if (marks >= 60 && marks < 75 && attendance >= 80) {
            percentage = 25;
            result = "Partial";
        }

        double scholarship = (percentage / 100) * annualFees;
        totalDisbursed += scholarship;

        System.out.println("Marks=" + marks + ", Attendence=" + (int) attendance + ", Category=" + category +
                " -> " + result + " | Amount = Rs." + (int) scholarship);
    }
}