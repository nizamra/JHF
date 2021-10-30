package Lab2;

public class TaxCalculator {
    
    public static void calculateTax(int salary){
        int tax;
        System.out.println("Salary Before Tax: "+salary);
        if(salary<23000)
            tax = salary/10;
        if(salary<50000)
            tax = salary/20;
        if(salary<100000)
            tax = salary/30;
        else
            tax = salary/40;

        System.out.println("Tax is: "+tax);
        System.out.println("Salary after tax: "+(salary-tax));
    }

    public static void main(String[] args){
        int x = (int)(Math.random()*150000);
        calculateTax(x);
    }
}
