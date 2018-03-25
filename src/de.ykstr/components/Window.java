package de.ykstr.components;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Window extends JFrame{

    Canvas panel;


    public Window(int width, int height){
        super();
        this.setSize(width,height);

        panel = new Canvas(width,height);
        panel.setSize(width,height);
        panel.setBackground(Color.white);
        this.getContentPane().add(panel);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public Window(){
        this(400,400);
    }

    public void addDrawable(Drawable d){
        panel.getDrawables().add(d);
    }

    public void removeDrawable(Drawable d){
        panel.getDrawables().remove(d);
    }
}
