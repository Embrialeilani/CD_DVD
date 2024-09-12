public class cd extends product {
    String artist;
    int numSong;
    String label;

    public cd() {
        super(); //mengakses Constructor Superclass
        artist = "";
        numSong = 0;
        label = "";
    }

    public cd(int number, String nama, int quantity, double price, String artist, int numSong, String label) {
        super(number, nama, quantity, price);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artis) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override //membuat method yang sama dengan method di superclass
    public void print() {
        super.print();
        System.out.println("Artist : " + artist);
        System.out.println("Totang Song: " + numSong);
        System.out.println("Label : " + label);

    }
}



