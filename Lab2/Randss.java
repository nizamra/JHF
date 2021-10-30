package Lab2;

public class Randss {
    public static void bingoo(int val){
        System.out.println(val);
        if (val<50)
        System.out.println("Small!");
        else if (val>50)
        System.out.println("Big!");
        else
        System.out.println("Bingo!");
        if (val%2==0)
        System.out.println("Even!");
        else
        System.out.println("Odd!");
    }
    
    public static void main(String[] args) {
        int value = (int)(Math.random()*100);
        bingoo(value);
    }

}
