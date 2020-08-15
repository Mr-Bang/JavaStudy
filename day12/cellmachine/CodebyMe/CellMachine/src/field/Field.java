package field;

import cell.Cell;

import java.util.ArrayList;

public class Field {
    private int width;
    private int height;
    private Cell[][] field;
    public Field(int width,int height)
    {
        this.width = width;
        this.height = height;
        field = new Cell[height][width];
    }
    public int getWidth()
    {
        return this.width;
    }
    public int getHeight()
    {
        return this.height;
    }
    public void place(int row,int col,Cell cell)
    {
        field[row][col] = cell;
    }
    public Cell get(int row,int col)
    {
        return field[row][col];
    }

    public Cell[] getNeighbour(int row, int col)
    {
        ArrayList<Cell> list = new ArrayList<Cell>();
        for(int i = -1;i<2;i++)
        {
            for(int j = -1;j<2;j++)
            {
                int r = row+i;
                int c = col+j;
                if(r>-1&&r<height&&c>-1&&c<width&&!(r==row&&c==col))
                {
                    list.add(field[r][c]);
                }
            }
        }
        return list.toArray(new Cell[list.size()]);
    }
}
