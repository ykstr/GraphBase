package de.ykstr.examples;

import de.ykstr.components.Drawable;

import java.awt.*;

public class Rectangle implements Drawable{

    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public Rectangle(int x, int y, int width, int height, Color c){
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
        setColor(c);
    }


    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.drawRect(x,y,width,height);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
