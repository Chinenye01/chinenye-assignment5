/*
dr * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */
package tools;

import java.awt.Point;
import java.awt.Shape;

/**
 * This is an interface for the tools needed to draw shapes.
 * 
 * @author Chinenye Ezenwoye    Chinenye@uw.edu
 * 
 * @version March 4 2019
 */
public interface Tool {
    /**
     * This will set the start point for the shape of the tool,
     * which is needed to draw the shape in the correct location.
     * 
     * @param theStartPoint The start point for the shape of the tool.
     */
    void setStartPoint(Point theStartPoint);
 
    /**
     * This will set the end point for the shape of the tool,
     * which is needed to draw the shape in the correct location.
     * 
     * @param theEndPoint The end point for the shape of the tool.
     */
    void setEndPoint(Point theEndPoint);
    
    /**
     * This will return the start point for the shape of the tool.
     * 
     * @return The start point for the shape of the tool.
     */
    Point getStartPoint();
    
    /**
     * This will return the end point for the shape of the tool.
     * 
     * @return The end point for the shape of the tool.
     */
    Point getEndPoint();
    
    /**
     * This will return the shape of the tool using the
     * correct start and end points.
     * 
     * @return The shape that will be drawn.
     */
    Shape getShape();
}