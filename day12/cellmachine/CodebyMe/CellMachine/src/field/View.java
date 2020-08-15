package field;

import cell.Cell;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
public class View extends JPanel {
    private static final int GRID_SIZE = 16;
    private Field theField;
    public View(Field field)
    {
        theField = field;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(int row = 0;row<theField.getHeight();row++)
        {
            for(int col = 0;col<theField.getWidth();col++)
            {
                Cell cell = theField.get(row,col);
                if(cell !=null)
                {
                    cell.draw(g,col*GRID_SIZE,row*GRID_SIZE,GRID_SIZE);
                }
            }
        }
    }
//    重载这个函数后，产生的图形大小就会变正常，这个函数应该和窗口大小有关
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(theField.getWidth()*GRID_SIZE+1, theField.getHeight()*GRID_SIZE+1);
    }
}
