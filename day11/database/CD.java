package database;

public class CD extends Item{
    private String artist;
    private int numofTracks;
    public CD(String title, String artist, int numofTracks, int playingTime, String comment) {
        super(title,playingTime,comment);
        this.artist = artist;
        this.numofTracks = numofTracks;
    }
    public void print()
    {
        System.out.print("CD:");
        super.print();
        System.out.println(":"+artist);
    }

    @Override
    public String toString() {
        return "CD{" +
                "artist='" + artist + '\'' +
                ", numofTracks=" + numofTracks +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        CD a = (CD) obj;
        return this.artist == ((CD) obj).artist;
    }


    public static void main(String[] args) {
        CD cd = new CD("ad","asd",1,2,"ss");
        CD cd1 = new CD("ad","asd",1,2,"ss");
        cd.print();
        System.out.println(cd);
        System.out.println(cd.equals(cd1));

    }
}
