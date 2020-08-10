package database;
//Item是CD和DVD的父类，CD和DVD继承Item的所有属性与函数
public class Item {
    private String title;
    private int playingTime;
    private String comment;

    public Item(String title, int playingTime, String comment) {
        this.title = title;
        this.playingTime = playingTime;
        this.comment = comment;
    }

    public void print() {
        System.out.print(title);
    }
}
