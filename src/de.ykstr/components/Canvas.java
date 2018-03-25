package de.ykstr.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Canvas extends JPanel{

    private ArrayList<Drawable> drawables;

    public Canvas(int width, int height){
        super();
        this.drawables = new ArrayList<>();
        this.setPreferredSize(new Dimension(width, height));
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Color temp;
        for(int i = 0; i<drawables.size(); i++){
            //temp = g.getColor();
            drawables.get(i).draw(g);
            //g.setColor(temp);
        }
    }

    public ArrayList<Drawable> getDrawables() {
        return drawables;
    }

    public void setDrawables(ArrayList<Drawable> drawables) {
        this.drawables = drawables;
    }
}
