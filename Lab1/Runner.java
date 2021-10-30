package Lab1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Runner {
    public static void main(String[] args) {
        int num1 = (int)(Math.random()*101);
        int num2 = (int)(Math.random()*101);
        System.out.println("num1: "+num1);
        System.out.println("num2: "+num2);
        System.out.println("sum: "+(num1+num2));
        System.out.println("avarage: "+((num1+num2)/2));
        System.out.println("First number reminder: "+(num1%10));
        System.out.println("Rectangle area: "+(num1*num2)+" meters squared");
        
        System.out.println(" ");
        System.out.println(" ------------------------------------ ");
        System.out.println(" ");
        
        int ranNum = (int)((Math.random()*251)+100);
        System.out.println("Random Between 100-350: "+ranNum);
        
        System.out.println(" ");
        System.out.println(" ------------------------------------ ");
        System.out.println(" ");
        
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd-MM-yyyy");
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("E, HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        String formattedDate2 = myDateObj.format(myFormatObj2);
        System.out.println("After formatting: " + formattedDate);
        System.out.println("After formatting to hours: " + formattedDate2);

        System.out.println(" ");
        System.out.println(" ------------------------------------ ");
        System.out.println(" ");

        Printer line = new Printer();
        line.go(3);
    }
}
