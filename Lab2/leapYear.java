package Lab2;

public class leapYear {
    public static void isLeap(int year){
        if(year%4==0){
            if(year%100!=0){
                System.out.println("year: "+year+" is a leap year");
            }
            if(year%400==0){
                System.out.println("year: "+year+" is a leap year");
            }
            }else{
                System.out.println("year: "+year+" is NOT a leap year");
            }
    }

    public static void main(String[] args){
        int year = (int)(Math.random()*2022);
        isLeap(year);
    }
}
