package database;

public class VideoGame extends Item {
    private int numberOfPlayers;

    public VideoGame(String title, int playingTime, String comment,int number)
    {
        super(title, playingTime, comment);
        numberOfPlayers = number;
    }
    public void print()
    {
        System.out.print("VideoGame:");
        super.print();
        System.out.println(":"+numberOfPlayers);
    }
}
