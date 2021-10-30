package BookCase;
public class BestSeller extends Book{
    private String summary;
    private int worldCopies;

    
    public BestSeller(int a, String b, double c, String summary, int worldCopies) {
        super(a, b, c);
        this.summary = summary;
        this.worldCopies = worldCopies;
    }

    public boolean equals(BestSeller obj) {
        return this.getName().equals(obj.getName());
    }
    @Override
    public String toString() {
        return (this.getName()+this.summary);
    }
    public String getSummary() {
        return summary;
    }
    public void setSummary(String summary) {
        this.summary = summary;
    }
    public int getWorldCopies() {
        return worldCopies;
    }
    public void setWorldCopies(int worldCopies) {
        this.worldCopies = worldCopies;
    }
    
}
