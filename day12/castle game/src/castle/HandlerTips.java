package castle;

public class HandlerTips extends Handler{
    public HandlerTips(Game game)
    {
        super(game);
    }

    @Override
    public void doCmd(String word) {
        System.out.println("this is tips for you");
    }
}
