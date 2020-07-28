package notebook;

import java.util.ArrayList;

public class Notebook
{
    private ArrayList<String> notes = new ArrayList<String>();
    public void add(String s)
    {
        notes.add(s);
    }
    public void add(String s, int location)
    {
        notes.add(location,s);
    }
    public int getSize()
    {
        return notes.size();
    }
    public String getNote(int index)
    {
        return notes.get(index);
    }
    public void removeNote(int index)
    {
        notes.remove(index);
    }
    public String[] list()
    {
        String[] list = new String[notes.size()];
        notes.toArray(list);
        return list;
    }
    public String toString()
    {
        return ""+notes;
    }
    public static void main(String[] args)
    {
        Notebook nb = new Notebook();
        nb.add("nmsl");
        System.out.println(nb.getSize());
        nb.add("wsnd");
        System.out.println(nb);
        System.out.println(nb.getNote(0));
        String[] a = nb.list();
        for(int i = 0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}
