package BookCase;
class Book{
    private int id;
    private String name;
    private double price;

    Book(int a, String b, double c){
        this.id = a;
        this.name = b;
        this.price = c;
    }

    public boolean equals(Book obj) {
        return this.name.equals(obj.name);
    }

    @Override
    public String toString() {
        return (this.name + " - " + this.price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}