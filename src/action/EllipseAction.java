/*
 * TCSS 305 Winter 2019
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
import tools.EllipseTool;

/**
 * An ellipse action for the Paint program.
 * 
 * @author Chinenye Ezenwoye    chinenye@uw.edu
 * 
 * @version     March 15, 2019
 */
public final class EllipseAction extends AbstractAction {
    /** 
     * This is a generated serialization ID. 
     */
    private static final long serialVersionUID = -2338361647653495469L;
    
    /** 
     * This is the icon for the ellipse action. 
     */
    private final Icon myEllipseIcon;
    
    /** 
     * This is the drawing panel where the ellipse tool will be used. 
     */
    private final DrawingPanel myDrawingPanel;

    /**
     * This is the constructor that will initializes the fields, set the icon,
     * and set selected key to true.
     * 
     * @param theDrawingPanel The drawing panel where the ellipse tool will be used.
     */
    public EllipseAction(final DrawingPanel theDrawingPanel) {
        super("Ellipse");
        myEllipseIcon = new ImageIcon("./resources/ellipse.gif");
        putValue(Action.SMALL_ICON, myEllipseIcon);
        final ImageIcon icon = (ImageIcon) myEllipseIcon;
        final Image largeImage =
                        icon.getImage().getScaledInstance(15, -1, java.awt.Image.SCALE_SMOOTH);
        final ImageIcon largeIcon = new ImageIcon(largeImage);
        putValue(Action.LARGE_ICON_KEY, largeIcon);
        putValue(Action.SELECTED_KEY, true);
        myDrawingPanel = theDrawingPanel;
    }

    /**
     * This will set the tool to the ellipse tool and sets the proper
     * stroke styles.
     * 
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(final ActionEvent arg0) {
        myDrawingPanel.setTool(new EllipseTool());
        myDrawingPanel.setCapStyle(BasicStroke.CAP_SQUARE);
        myDrawingPanel.setJoinStyle(BasicStroke.JOIN_MITER);
    }
}
