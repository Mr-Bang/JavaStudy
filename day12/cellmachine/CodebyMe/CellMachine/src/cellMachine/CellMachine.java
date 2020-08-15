package cellMachine;

import cell.Cell;
import field.Field;
import field.View;

import javax.swing.*;

public class CellMachine {
    public static void main(String[] args) {
        Field field = new Field(30,30);
        for(int row = 0;row<field.getHeight();row++)
        {
            for(int col = 0;col<field.getWidth();col++)
            {
                field.place(row,col,new Cell());
//                不知为何，前面不加上一个import cell.Cell;这句话
//                就会编译失败
            }
        }
        for(int row = 0;row<field.getHeight();row++)
        {
            for(int col = 0;col<field.getWidth();col++)
            {
                Cell cell = field.get(row,col);
                if(Math.random()<0.2)
                {
                    cell.reborn();
                }
            }
        }
        View view = new View(field);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        frame.setTitle("Cells");
        frame.add(view);
        frame.pack();
        frame.setVisible(true);
//以上部分生成了一个20%活细胞的静态细胞图，接下来开始产生变化
        for(int i = 0;i<1000;i++)
        {
            for(int row = 0;row<field.getHeight();row++)
            {
                for (int col = 0; col < field.getWidth(); col++)
                {
                    Cell cell =field.get(row,col);
                    Cell[] neighbour = field.getNeighbour(row,col);
                    int numOfLive = 0;
                    for(Cell c:neighbour)
                    {
                        if(c.isAlive())
                        {
                            numOfLive++;
                        }
                    }
                    if(cell.isAlive())
                    {
                        if(numOfLive<2||numOfLive>3)
                        {
                            cell.die();
                        }

                    }
                    else if(numOfLive==3)
                    {
                        cell.reborn();
                    }
                }
            }
            frame.repaint();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
