/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import Save.Saver;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import shapes.Queue;

/**
 *
 * @author user
 */
public class SaveButton extends Button {

    private static final long serialVersionUID = 1L;

    public SaveButton(Queue queue) {
        super("Save");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    new Saver(queue);
                } catch (IOException ioException) {

                    ioException.printStackTrace();
                }
            }
        });
    }
}
