public class dvd extends product {
    int length;
    String rating;
    String studio;

    public dvd() {
        super();
        length = 0;
        rating = "";
        studio = "";
    }
    
    public dvd(int number, String nama, int quantity, double price, int length, String rating, String studio) {
        super(number, nama, quantity, price);
        this.length = length;
        this.rating = rating;
        this.studio = studio;  
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    @Override
    public void print() {
        super.print();
        System.out.println("Length : " + length);
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
    }

}
