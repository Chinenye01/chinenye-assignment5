/**
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */

package action;

import gui.DrawingPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JColorChooser;



/**
 * A color action for the Paint program.
 * 
 * @author Chinenye Ezenwoye    Chinenye@uw.edu
 * 
 * @version March 4, 2019
 */
public final class ColorAction extends AbstractAction {
    
    /** 
     * This is a generated serialization ID. 
     */
    private static final long serialVersionUID = 1564105703913928581L;
    
    /** 
     * This is the drawing panel where the color will be used. 
     */
    private final DrawingPanel myDrawingPanel;
    
    /**
     * This is the constructor that will initializes the fields.
     * 
     * @param theDrawingPanel The drawing panel where the color will be used.
     */
    public ColorAction(final DrawingPanel theDrawingPanel) {
        super("Color...");
        myDrawingPanel = theDrawingPanel;
    }

    /**
     * This will open color chooser and sets the proper color
     * when painting on the draw panel.
     * 
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(final ActionEvent arg0) {
        final Color currentColor = JColorChooser.showDialog(null, "Color Chooser", 
                                                            myDrawingPanel.getColor());
        if (currentColor != null) {
            myDrawingPanel.setColor(currentColor);
        }
    }

}
