package lab04;

public class Track {

    public String genre;
    static int counter = 1;
    public int numTrack;
    public double lenTrack;

    public Track(double lenTrack){
        this.numTrack = counter++;
        this.lenTrack = lenTrack;
    }
    public void printTrack(){
        System.out.printf("-- %d композиция -- \n", numTrack);
        System.out.printf("Длина композиции: %f секунд\n", lenTrack);
    }
}
