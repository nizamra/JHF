package Lab3;

public class loopsTen {
    public static void main(String[] args){
        for (int i = 1; i < 11; i++) {
            System.out.println(i+" Hello All");
        }
        System.out.println(" ");
        System.out.println(" ------------------------------------ ");
        System.out.println(" ");
        int i = 1;
        while(i<11){
            System.out.println(i+" Hello All");
            i++;
        }
        System.out.println(" ");
        System.out.println(" ------------------------------------ ");
        System.out.println(" ");
        int x = (int)(Math.random()*20);;
        i = 1;
        while(i<x){
            System.out.println(i+" Hello All");
            i++;
        }
        System.out.println(" ");
        System.out.println(" ------------------------------------ ");
        System.out.println(" ");
        int y = (int)(Math.random()*20);;
        int z = (int)(Math.random()*20);;
        System.out.println(y+" this is Y");
        System.out.println(z+" this is Z");
        if(y<z){
            while(y<z){
                System.out.println(y+" Hello All");
                y++;
            }
        }else if(z<y){
            while(z<y){
                System.out.println(z+" Hello All");
                z++;
            }
        }else{
            System.out.println("Bingoo the two numbers are equal");
        }
        System.out.println(" ");
        System.out.println(" ------------------------------------ ");
        System.out.println(" ");
        int f = (int)(Math.random()*20);;
        int den = (int)((Math.random()*f)+1);;
        System.out.println(f+" this is F");
        System.out.println(den+" this is den");
        i=0;
        while(i<f){
            if(i%den==0){
                System.out.println(i);
            }
            i++;
            }
            System.out.println(" ");
            System.out.println(" ------------------------------------ ");
            System.out.println(" ");
        int fact = (int)((Math.random()*7)+1);
        System.out.println(fact+" this is the number to be Factorialize");
        i=1;
        int res = fact;
        while(i<fact){
            res*=i;
            i++;
        }
        System.out.println(res+" Done Factorialing");
    }
}
