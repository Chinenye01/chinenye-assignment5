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
import tools.PencilTool;

/**
 * This is the action class that handles a pencil.
 * 
 * @author Chiennye Ezenwoye    chinenye@uw.edu
 * 
 * @version March 15, 2019
 */
public final class PencilAction extends AbstractAction {
    /** 
     * This is a  generated serial version ID. 
     */
    private static final long serialVersionUID = -2338361647653495469L;
    
    /** 
     * This is the icon for the pencil action. 
     */
    private final Icon myPencilIcon;
    
    /** 
     * This is the drawing panel where the pencil tool will be used. 
     */
    private final DrawingPanel myDrawingPanel;

    /**
     * This is the constructor that will initialize the fields, set the icon,
     * and set selected key to true.
     * 
     * @param theDrawingPanel The drawing panel where the pencil tool will be used.
     */
    public PencilAction(final DrawingPanel theDrawingPanel) {
        super("Pencil");
        myPencilIcon = new ImageIcon("./resources/pencil.gif");
        putValue(Action.SMALL_ICON, myPencilIcon);
        final ImageIcon icon = (ImageIcon) myPencilIcon;
        final Image largeImage =
                        icon.getImage().getScaledInstance(15, -1, java.awt.Image.SCALE_SMOOTH);
        final ImageIcon largeIcon = new ImageIcon(largeImage);
        putValue(Action.LARGE_ICON_KEY, largeIcon);
        putValue(Action.SELECTED_KEY, true);
        myDrawingPanel = theDrawingPanel;
    }

    /**
     * This will set tool for the pencil tool and set the proper
     * stroke styles.
     * 
     * {@inheritDoc}
     */
    @Override
    public void actionPerformed(final ActionEvent arg0) {
        myDrawingPanel.setTool(new PencilTool());
        myDrawingPanel.setCapStyle(BasicStroke.CAP_ROUND);
        myDrawingPanel.setJoinStyle(BasicStroke.JOIN_ROUND);
    }
}
