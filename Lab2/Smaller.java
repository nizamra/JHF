package Lab2;

public class Smaller {
    public static void main(String[] args){

   
        int x = (int)((Math.random()*1000)+5000);
        int y = (int)((Math.random()*1000)+5000);
        int z = (int)((Math.random()*1000)+5000);
    
            System.out.print(x+"  "+y+"  "+z);
            
            System.out.println(" ");
            System.out.println(" ------------------------------------ ");
            System.out.println(" ");
            
            if (x < y && x < z)
            System.out.println("First number is the smallest.");
          else if (y < x && y < z)
            System.out.println("Second number is the smallest.");
          else if (z < x && z < y)
            System.out.println("Third number is the smallest.");
          else
            System.out.println("The numbers are not distinct.");
    }
}
