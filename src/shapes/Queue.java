/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Queue {
    ArrayList<Shape> queue;
    Color currentColor;
    
    public Queue(){
        queue = new ArrayList<>();
        currentColor = Color.BLACK;
        queue.add(new PolyLine());
    }

    public int getSize() {
        return queue.size();
    }

    public void ClearQueue() {
        queue.clear();
    }

    public void addShape(Shape shape) {
        shape.setColor(currentColor);
        queue.add(shape);
    }

    public Shape getLastShape() {
        if (queue.isEmpty())
            return null;
        return queue.get(queue.size() - 1);
    }

    public void drawShapes(Graphics g) {
        for (Shape shape : queue) {
            shape.drawShape(g);
        }
    }
    
    public Color getCurrentColor(){
        return currentColor;
    }
    
    public void setCurrentColor(Color color){
        currentColor = color;
    }
    
    public ArrayList<Shape> getQueue() {
        return queue;
    }
    
}
