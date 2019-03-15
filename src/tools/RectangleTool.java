/*
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */

package tools;

import java.awt.Shape;
import java.awt.geom.Rectangle2D;

/**
 * This is the class that handles the 
 * rectangle tool.
 * 
 * @author Chinenye Ezenwoye    chinenye@uw.edu
 * 
 * @version March 15, 2019
 */
public final class RectangleTool extends AbstractTool {
    /**
     * This will returns a rectangle with specified start point
     * and the width and height.
     * 
     * {@inheritDoc}
     */
    @Override
    public Shape getShape() {
        final int startX = (int) Math.min(getStartPoint().getX(), getEndPoint().getX());
        final int startY = (int) Math.min(getStartPoint().getY(), getEndPoint().getY());
        final int endX = (int) Math.max(getStartPoint().getX(), getEndPoint().getX());
        final int endY = (int) Math.max(getStartPoint().getY(), getEndPoint().getY());
        return new Rectangle2D.Double(startX, startY, endX - startX, endY - startY);
    }
}
