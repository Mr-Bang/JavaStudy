package database;

public class DVD extends Item{
    private String director;

    public DVD(String title, String director, int playingTime, String comment) {
        super(title,playingTime,comment);
        this.director = director;

    }

    public void print() {
        System.out.print("DVD:");
        super.print();
        System.out.println(":"+director);

    }
}
