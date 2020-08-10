package database;

import java.util.ArrayList;

public class Database {
    private ArrayList<Item> list = new ArrayList<Item>();
    public void add(Item cd)
    {
        list.add(cd);
    }
    public void list()
    {
        for(Item a:list)
        {
            a.print();
        }
    }

    public static void main(String[] args) {
        Database db = new Database();
        db.add(new CD("nmsl","wsnd",11,4,"jl"));
        db.list();
        db.add(new DVD("asd","wcnm",114,"azhe"));
        db.list();
        db.add(new VideoGame("video",114,"....",99));
        db.list();
        db.add(new FPSGame("r6",500,"...",13,12));
        db.list();
    }

}
