package tools;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

import graphicedior.EditorCanvas;
import graphicedior.GraphicEdior;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author user
 */
public class SavePNGButton extends Button {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public SavePNGButton(EditorCanvas canvas) {
        super("Save as PNG");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File f = new File("image.png");
                try {
                    ImageIO.write(canvas.getBuff(), "png", f);
                } catch (IOException ex) {
                    Logger.getLogger(GraphicEdior.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}