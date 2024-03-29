/*
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */
package gui;

import action.ColorAction;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.Action;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * A menu bar used by the GUI.
 * 
 * @author Chinenye Ezenwoye    Chinenye@uw.edu
 * 
 * @version NMarch 4, 2019
 */
public final class GUIMenuBar extends JMenuBar implements PropertyChangeListener {

    /** 
     * This a generated serialization ID.
     */
    private static final long serialVersionUID = -4010954639105678332L;
    
    /** 
     * This will give the amount between major tick spacing in the slider.
     */
    private static final int MY_TICK_SPACING = 5;
    
    /** 
     * This is a button group for the buttons for the tools. 
     */ 
    private final ButtonGroup myGroup;
    
    /** 
     * This is the JMenu for the tools. 
     */
    private final JMenu myTools;
    
    /** 
     * This is the list of buttons menu items for the tools. 
     */
    private final List<JRadioButtonMenuItem> myButtonMenuItems;
    
    /** 
     * This is the clear button. 
     */
    private final JMenuItem myClearButton;
    
    /** 
     * This is the drawing panel where color will be set. 
     */
    private final DrawingPanel myDrawingPanel;
    
    /**
     * The constructs the menu bar for the GUI program.
     * 
     * @param theDrawingPanel The drawing panel where the color will be set.
     */
    protected GUIMenuBar(final DrawingPanel theDrawingPanel) {
        myButtonMenuItems = new ArrayList<>();
        myClearButton = new JMenuItem("Clear...");
        myGroup = new ButtonGroup();
        myTools = new JMenu("Tools");
        myDrawingPanel = theDrawingPanel;
        myDrawingPanel.addPropertyChangeListener(this);
        setUpMenuBar();  
    }
    
    /**
     * This is set up the JMenuBar with all of the proper 
     * components.
     */
    private void setUpMenuBar() {
        final JMenu options = new JMenu("Options");
        final JMenu thickness = new JMenu("Thickness");
        final JSlider slider = new JSlider(SwingConstants.HORIZONTAL, 0, 15, 
                                           myDrawingPanel.getThickness());
        slider.setMajorTickSpacing(MY_TICK_SPACING);
        slider.setMinorTickSpacing(1);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(final ChangeEvent theEvent) {
                myDrawingPanel.setThickness(slider.getValue());
            }
        });
        thickness.add(slider);
        options.add(thickness);
        options.addSeparator();
        options.add(new JMenuItem(new ColorAction(myDrawingPanel)));
        options.addSeparator();
        
        myClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent)
            {
                myDrawingPanel.clearPanel();
            }
        });
        options.add(myClearButton);
        myClearButton.setEnabled(false);
        add(options);
       
        add(myTools);
        
        final JMenu help = new JMenu("Help");
        final JMenuItem aboutItem = new JMenuItem("About...");
        aboutItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent theEvent) {
                ImageIcon icon = new ImageIcon("./resources/pencil.gif");
                final Image image =
                        icon.getImage().getScaledInstance(90, -1, java.awt.Image.SCALE_SMOOTH);
                icon = new ImageIcon(image);
                JOptionPane.showMessageDialog(null, 
                      "Winter 2019\nChinenye Ezenwoye",
                      "TCSS 305 - Paint Program", JOptionPane.PLAIN_MESSAGE, icon);
            }
        });
        help.add(aboutItem);
        add(help);
    }
    
    /**
     * This will create a radio button menu item with each respective action,
     * and adds them to the tool menu and the button group.
     * 
     * @param theAction The action associated with each respective JRadioButtonMenuItem.
     */
    protected void createButton(final Action theAction)  {
        final JRadioButtonMenuItem radioButtonMenuItem = new JRadioButtonMenuItem(theAction);
        myButtonMenuItems.add(radioButtonMenuItem);
        myGroup.add(radioButtonMenuItem);
        myTools.add(radioButtonMenuItem);
    }
    
    /**
     * This will set the default selected button to the first button
     * added to the button group.
     */
    protected void setDefault() {
        myButtonMenuItems.get(0).setSelected(true);
    }
    
    @Override
    public void propertyChange(final PropertyChangeEvent theEvent) {
        if (theEvent.getPropertyName().equals("There are items to clear.")) {
            myClearButton.setEnabled((boolean) theEvent.getNewValue());
        }
        else if (theEvent.getPropertyName().equals("There are no items to clear.")) {
            myClearButton.setEnabled((boolean) theEvent.getNewValue());
        }
    }
}
    