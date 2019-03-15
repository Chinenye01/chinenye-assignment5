/*
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */

package gui;

import java.awt.Color;
import java.awt.Shape;

/**
 * This class will keep track of the different
 * of the shape to be painted, including the color,
 * thickness, the shape, and cap and join style.
 * 
 * @author Chinenye Ezenwoye    chinenye@uw.edu
 * 
 * @version March 4, 2018
 */
public final class PaintShape {
    /** 
     * This will set the  color of the shape. 
     */
    private final Color myColor;
    
    /** 
     * This will set the thickness of the shape. 
     */
    private final int myThickness;
    
    /** 
     * This is the shape to be painted. 
     */
    private final Shape myShape;
    
    /** 
     * This is the cap style for the stroke. 
     */
    private final int myCapStyle;
    
    /** 
     * This is the join style for the stroke. 
     */
    private final int myJoinStyle;
    
    /**
     * This will initialize the color, thickness, shape, cap style,
     * and join style. 
     * 
     * @param theColor The color of the shape.
     * @param theThickness The thickness of the shape.
     * @param theShape The shape to be painted.
     * @param theCapStyle The cap style of the shape.
     * @param theJoinStyle The join style of the shape.
     */
    protected PaintShape(final Color theColor, final int theThickness, final Shape theShape,
                         final int theCapStyle, final int theJoinStyle) {
        myColor = theColor;
        myThickness = theThickness;
        myShape = theShape;
        myCapStyle = theCapStyle;
        myJoinStyle = theJoinStyle;
    }
    
    /**
     * This will return the color of the shape.
     * 
     * @return The color of the shape.
     */
    protected Color getColor() {
        return myColor;
    }
    
    /**
     * This will return the thickness of the shape.
     * 
     * @return The thickness of the shape.
     */
    protected int getThickness()
    {
        return myThickness;
    }
    
    /**
     * This will return the shape to be painted.
     * 
     * @return The shape that will be painted.
     */
    protected Shape getShape() {
        return myShape;
    }
    
    /**
     * This will return the cap style of the shape.
     * 
     * @return The cap style of the shape.
     */
    protected int getCapStyle() {
        return myCapStyle;
    }
    
    /**
     * This will return the join style of the shape.
     * 
     * @return The join style of the shape.
     */
    protected int getJoinStyle() {
        return myJoinStyle;
    }
}