package Lab1;

public class Printer {
    String part1 = "There will be";
    int visitors = 5;
    String part2 = "people for dinner.";

    public void go(int toAdd){
        visitors=visitors+toAdd;
        System.out.println(part1+" "+ visitors+2 +" "+part2);
    }
}
