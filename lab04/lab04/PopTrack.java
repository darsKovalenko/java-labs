package lab04;

public class PopTrack extends Track{
    private String author;
    public PopTrack(double len)
    {
        super(len);
        genre = "Поп-музыка";
    }
    public PopTrack(double len, String author)
    {
        super(len);
        setAuthor(author);
        genre = "Поп-музыка";
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