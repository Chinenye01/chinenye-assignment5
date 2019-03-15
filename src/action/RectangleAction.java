/*
 * TCSS 305 Winter 2018
 * 
 * Assignment 5 - Paint
 */

package action;

import gui.DrawingPanel;
import java.awt.BasicStroke;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import tools.RectangleTool;

/**
 * This is the action class that handles a rectangle.
 * 
 * @author Chinenye Ezenwoye    chinenye@uw.edu
 * 
 * @version March 15, 2019
 */
public final class RectangleAction extends AbstractAction {
    /** 
     * This is a generated serial version ID. 
     */
    private static final long serialVersionUID = -2338361647653495469L;
    
    /** 
     * This is an icon for the rectangle action. 
     */
    private final Icon myRectangleIcon;
    
    /** 
     * This is the drawing panel where the rectangle tool will be used. 
     */
    private final DrawingPanel myDrawingPanel;

    /**
     * This is the constructor that will initialize the fields, set the icon,
     * and set selected key to true.
     * 
     * @param theDrawingPanel The drawing panel where the rectangle tool will be used.
     */
    public RectangleAction(final DrawingPanel theDrawingPanel) {
        super("Rectangle");
        myRectangleIcon = new ImageIcon("./resources/rectangle.gif");
        putValue(Action.SMALL_ICON, myRectangleIcon);
        final ImageIcon icon = (ImageIcon) myRectangleIcon;
        final Image largeImage =
                        icon.getImage().getScaledInstance(15, -1, java.awt.Image.SCALE_SMOOTH);
        final ImageIcon largeIcon = new ImageIcon(largeImage);
        putValue(Action.LARGE_ICON_KEY, largeIcon);
        putValue(Action.SELECTED_KEY, true);
        myDrawingPanel = theDrawingPanel;
    }

    /**
     * This will set the tool to the rectangle tool and set the proper
     * stroke styles.
     * 
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(final ActionEvent arg0) {
        myDrawingPanel.setTool(new RectangleTool());
        myDrawingPanel.setCapStyle(BasicStroke.CAP_SQUARE);
        myDrawingPanel.setJoinStyle(BasicStroke.JOIN_MITER);
    }

}
