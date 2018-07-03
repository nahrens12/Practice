public class Book extends Item {


    private int id;
    private String colour;
    private String genre;

    public Book(int id, String colour, String genre) {
        super(id);
        this.colour = colour;
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", colour='" + colour + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}




