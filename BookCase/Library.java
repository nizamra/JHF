package BookCase;
public class Library {
    public static void main(String[] args){
        Storage stg = new Storage();
        stg.addbook(new Book(01, "Pirates Of The Caribian", 13.5));
        stg.addbook(new Book(02, "Harry Poter", 15.5));
        stg.addbook(new Book(03, "Head First Java", 10.7));
        stg.addbook(new BestSeller(04,"Planting Green",25,"trampoline of the fantastic plastic",1200));
        stg.addbook(new BestSeller(05,"Boyhood",9.5,"some boy playing in a school",5600));
        stg.addbook(new BestSeller(05,"Wild Wild",17,"flamingo doing his things in the wild",200));

        
    }
}
