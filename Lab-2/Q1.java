public class Q1{
    public static void main(String[] arrgs){
        int marks1=85 , marks2=72, marks3=90, marks4=65, marks5= 78;

        int total= marks1+marks2+marks3+marks4+marks5;
        float percntage=total/5;
        String result;

        if(percntage<=40){
             result="Fail";
        }
        else{
            result="Pass";
        }

        System.out.println("Total= "+total);
        System.out.println("Percentage= "+percntage+"%");
        System.out.println("Result = "+result);
    }
}
