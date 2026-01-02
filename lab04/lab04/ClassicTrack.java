package lab04;

public class ClassicTrack extends Track {
    private String author;
    public ClassicTrack(double len)
    {
        super(len);
        genre = "Классика";
    }
    public ClassicTrack(double len, String author)
    {
        super(len);
        genre = "Классика";
        setAuthor(author);
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }
    public void printTrack(){
        super.printTrack();
        System.out.printf("Жанр композиции: %s \n", genre);

        if (author != null)
        {
            System.out.printf("Автор композиции: %s \n", getAuthor());
        }
    }

}
