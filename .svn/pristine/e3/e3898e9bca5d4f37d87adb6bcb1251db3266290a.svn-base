/*
 * TCSS 305 Winter 2019
 * 
 * Assignment 5 - Paint
 */


package gui;

import java.awt.EventQueue;

/**
 * This class starts the Power Paint 
 * program.
 * 
 * @author Chinenye Ezenwoye    chinenye@uw.edu
 * 
 * @version March 04, 2019
 */
public final class Driver {
    /**
     * This is a private constructor to prevent
     * external instantiation.
     */
    private Driver() {
        throw new IllegalStateException();
    }

    /**
     * This is the starting point for the power paint program.
     * 
     * @param theArgs Command line arguments.
     */
    public static void main(final String... theArgs) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().start();
            }
        });
    }
}
