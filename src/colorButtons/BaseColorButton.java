/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colorButtons;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author user
 */
public abstract class BaseColorButton extends JButton {

    private static final long serialVersionUID = 1L;

    BaseColorButton() {
        super();
    }

    abstract public Color getColor();
}
