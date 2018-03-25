package de.ykstr.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends JFrame{

    private Canvas panel;

    public Window(int width, int height, Color background){
        super();
        this.setSize(width,height);

        panel = new Canvas(width,height);
        panel.setSize(width,height);
        panel.setBackground(background);
        this.getContentPane().add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Window(){
        this(400,400,Color.white);
    }

    public void addDrawable(Drawable d){
        panel.getDrawables().add(d);
    }

    public void removeDrawable(Drawable d){
        panel.getDrawables().remove(d);
    }

    public void setBackgroundColor(Color color){
        panel.setBackground(color);
    }
}
