/*
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */

package tools;

import java.awt.Shape;
import java.awt.geom.Line2D;

/**
 * This is the class that handles the
 * line tool. 
 * 
 * @author Chinenye Ezenwoye    Chinenye@uw.edu
 * 
 * @version March 4, 2019
 */
public final class LineTool extends AbstractTool {
    /**
     * Returns a line from the start point and 
     * the end point.
     * 
     * {@inheritDoc}
     */
    @Override
    public Shape getShape() {
        return new Line2D.Double(getStartPoint(), getEndPoint());
    }
}