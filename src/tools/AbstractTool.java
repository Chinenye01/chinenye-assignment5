/*
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */

package tools;

import java.awt.Point;

/**
 * This is the class for an abstract tool.
 * 
 * @author Chinenye Ezenwoye    Chinenye@uw.edu
 * 
 * @version March 4, 2019
 */
public abstract class AbstractTool implements Tool {
    /** 
     * This is a point outside the bounds of the GUI. 
     */
    private static final Point NO_POINT = new Point(-50, -50);
    
    /** 
     * This is the start point of the tool. 
     */
    private Point myStartPoint;
    
    /** 
     * This is the end point of the tool. 
     */
    private Point myEndPoint;
    
    /** 
     * This will initialize the start and end points. 
     */
    public AbstractTool() {
        myStartPoint = NO_POINT;
        myEndPoint = NO_POINT;
    }
    
    @Override
    public void setStartPoint(final Point theStartPoint) {
        myStartPoint = (Point) theStartPoint.clone();
        myEndPoint = (Point) theStartPoint.clone();
    }
    
    @Override
    public void setEndPoint(final Point theEndPoint) {
        myEndPoint = (Point) theEndPoint.clone();
    }
    
    @Override
    public Point getStartPoint() {
        return myStartPoint;
    }
    
    @Override
    public Point getEndPoint() {
        return myEndPoint;
    }
}