package Lab2;

public class SalaryRaiser {
    public static void main(String[] args) {
        int salary = (int)((Math.random()*1000)+5000);
        System.out.println(salary);
        if (salary<6000)
            salary+=(int)salary*0.1;
        else
            salary+=(int)salary*0.05;
        
        System.out.println("Updated "+salary);
    }
}
