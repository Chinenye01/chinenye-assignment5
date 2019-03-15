/*
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */

package tools;

import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Path2D;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the class that handles the pencil
 * tool.
 * 
 * @author Chinenye Ezenwoye    chinenye@uw.edu
 * 
 * @version March 15, 2019
 */
public final class PencilTool extends AbstractTool {
    /** 
     * This is the list of points that the path will go through.
     */
    private final List<Point> myPoints;

    /**
     * This will implicitly call parent constructor and initialize
     * the list of points for the path.
     */
    public PencilTool() {
        myPoints = new ArrayList<>();
    }
    
    /**
     * This will set start point and end point to the specified point,
     * and also clear the list of points in the path.
     * 
     * {@inheritDoc}
     */
    @Override
    public void setStartPoint(final Point theStartPoint) {
        myPoints.clear();
        super.setStartPoint((Point) theStartPoint.clone());
        super.setEndPoint((Point) theStartPoint.clone());      
    } 
    
    /**
     * This will return a specified path with the start points and 
     * end points.
     * 
     * {@inheritDoc}
     */
    @Override
    public Shape getShape() {
        final Path2D pencilShape = new Path2D.Double();
        pencilShape.moveTo(getStartPoint().getX(), getStartPoint().getY());
        myPoints.add(getEndPoint());
        for (Point pathPoint : myPoints)
        {
            pencilShape.lineTo(pathPoint.getX(),  pathPoint.getY());
        }
        return pencilShape;
    }
}