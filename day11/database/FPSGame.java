package database;

public class FPSGame extends VideoGame {
    private int peopleNum;
    public FPSGame(String title, int playingTime, String comment, int number,int pepn)
    {
        super(title, playingTime, comment, number);
        peopleNum = pepn;
    }

    @Override
    public void print() {
        System.out.print("FPSGame:");
        super.print();
        System.out.println(":"+peopleNum);
    }
}
