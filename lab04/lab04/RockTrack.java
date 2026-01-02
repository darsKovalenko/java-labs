package lab04;

public class RockTrack extends Track{
    private String author;
    public RockTrack(double len)
    {
        super(len);
        genre = "Рок";
    }
    public RockTrack(double len, String author)
    {
        super(len);
        setAuthor(author);
        genre = "Рок";
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
