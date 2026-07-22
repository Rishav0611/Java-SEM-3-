
public class Q2 {
    public static void main(String[] args) {
        int basicSalary=45000;

        int HRA=basicSalary*20/100;
        int DA=basicSalary*30/100;
        int PF=basicSalary*12/100;

        int NetSalary=(basicSalary+HRA+DA)-PF;

        System.out.println("HRA: "+HRA);
        System.out.println("DA: "+DA);
        System.out.println("PF: "+PF);
        System.out.println("NetSalary: "+NetSalary);
    }
}
