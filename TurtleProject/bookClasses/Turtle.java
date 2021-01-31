package bookClasses;

import java.util.*;
import java.awt.*;

/**
 * Class that represents a turtle which is similar to a Logo turtle.
 * This class inherts from SimpleTurtle and is for students
 * to add methods to.
 *
 * Copyright Georgia Institute of Technology 2004
 * @author Barb Ericson ericson@cc.gatech.edu
 */
public class Turtle extends SimpleTurtle
{
  Random gen = new Random();
  ////////////////// constructors ///////////////////////

  /** Constructor that takes the x and y and a picture to
   * draw on
   * @param x the starting x position
   * @param y the starting y position
   * @param picture the picture to draw on
   */
  public Turtle (int x, int y, Picture picture)
  {
    // let the parent constructor handle it
    super(x,y,picture);
  }

  /** Constructor that takes the x and y and a model
   * display to draw it on
   * @param x the starting x position
   * @param y the starting y position
   * @param modelDisplayer the thing that displays the model
   */
  public Turtle (int x, int y,
                 ModelDisplay modelDisplayer)
  {
    // let the parent constructor handle it
    super(x,y,modelDisplayer);
  }

  /** Constructor that takes the model display
   * @param modelDisplay the thing that displays the model
   */
  public Turtle (ModelDisplay modelDisplay)
  {
    // let the parent constructor handle it
    super(modelDisplay);
  }

  /**
   * Constructor that takes a picture to draw on
   * @param p the picture to draw on
   */
  public Turtle (Picture p)
  {
    // let the parent constructor handle it
    super(p);
  }

  /////////////////// methods ///////////////////////


  public static void main(String[] args)
  {
    World earth = new World();
    Turtle t1 = new Turtle(earth);
    t1.forward();
    t1.drawSquare(25);
  }
  /**
   * drawSquare - draw a square of n length
   * @param side length
   */

  public void drawSquare(int side)
  {
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
      turn(90);
      forward(side);
      turn(90);


  }
  /**
   * randomWalk - walks a random amount given upper limit steps
   * @param - int steps, upper limit of random # generated
   */
  public void randomWalk(int steps) {
      forward(gen.nextInt(steps));
  }
  /**
   * drawRec - draws a rectanble
   * @param - int width, int height
   */
  public void drawRec(int width, int height) {
      forward(height);
      turn(90);
      forward(width);
      turn(90);
      forward(height);
      turn(90);
      forward(width);
      turn(90);
  }
  /**
   * drawEquiTri - draws an equilateral triangle
   * @param - int side, sides are equal
   */
  public void drawEquiTri(int side) {
      forward(side);
      turn(120);
      forward(side);
      turn(120);
      forward(side);
      turn(120);
  }
  /**
   * drawHex - draws a hexagon
   * @param - int side, sides are equal
   */
  public void drawHex(int side) {
      for (int i = 0; i < 6; i++) {
          forward(side);
          turn(60);
      }
  }
  /**
   * drawCircle - draws a circle
   * @param - int r, radius of circle
   */
  public void drawCircle(int r) {
      //how to draw given radius
  } 
  /**
   * drawHexFlower - draws a flower using hexagons
   * @param - int side - side of each hex
   */
  public void drawHexFlower(int side){ // param should be <50-ish because canvas size
     if (side > 50)
        System.out.println("Please use a side less than 50");
     else{
         for (int i = 0; i < 6; i++){
             drawHex(side);
             forward(side);
             turn(300);
         }
     }
  }
} // this } is the end of class Turtle, put all new methods before this