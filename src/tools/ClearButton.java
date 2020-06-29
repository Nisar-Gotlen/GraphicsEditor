package tools;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import graphicedior.EditorCanvas;
import shapes.Queue;

public class ClearButton extends Button {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public ClearButton(Queue queue, EditorCanvas canvas) {
        super("Clear");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                canvas.getBuff().flush();
                queue.ClearQueue();
                canvas.revalidate();
                canvas.PaintToBuffer();
                canvas.repaint();
            }
        });

    }
}