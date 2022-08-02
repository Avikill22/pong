package com.company;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Paddle extends Rectangle{

    int id;
    int yVelocity;

    Paddle(int x, int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id){
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id = id;
    }
    public void keyPressed(KeyEvent e){
        switch(id){
            case 1:
                if(e.getKeyCode() == KeyEvent.VK_W){
                    setYDirection(-10);
                    move();
                }else if(e.getKeyCode() == KeyEvent.VK_S){
                    setYDirection(10);
                    move();
                }
                break;
            case 2:
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    setYDirection(-10);
                    move();
                }else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                    setYDirection(10);
                    move();
                }
                break;
        }
    }
    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(0);
                    move();
                } else if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0);
                    move();
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(0);
                    move();
                } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0);
                    move();
                }
                break;
        }
    }
    public void move(){
        y = y + yVelocity;
    }
    public void draw(Graphics g){
        if(this.id == 1){
            g.setColor(Color.blue);
        }else{
            g.setColor(Color.red);
        }
        g.fillRect(x,y,width,height);
    }
    public void setYDirection(int yVelocity) {
        this.yVelocity = yVelocity;
    }
}
