package test;

import de.ykstr.components.Window;
import de.ykstr.examples.Rectangle;

import java.awt.*;

public class Test {
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            Window w = new Window();
            w.addDrawable(new Rectangle(50,50,50,50,Color.black));
            w.addDrawable(new Rectangle(25,25,50,50,Color.green));
            w.addDrawable(new Rectangle(25,76,50,50,Color.red));
            w.addDrawable(new Rectangle(76,76,50,50,Color.cyan));
            w.addDrawable(new Rectangle(76,26,50,50,Color.orange));

            w.repaint();
        });
    }
}
