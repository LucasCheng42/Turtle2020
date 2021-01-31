package bookClasses;

import java.util.*;


public class TurtleTest
{
  public static void main(String[] args)
  {
    Random randNumGen = new Random();
    World world = new World(false);
    Turtle me = new Turtle(world);

    Turtle[] turtleArray = new Turtle[100];
    for (int i=0; i < 100; i++)
      turtleArray[i] = new Turtle(world);

    for (int i=0; i < 10; i++) 
    {
      turtleArray[i].turn(randNumGen.nextInt(360));
      turtleArray[i].randomWalk(100);
      turtleArray[i].drawHexFlower(50);
    }
    me.moveTo(200,200);
    me.drawSquare(200);
    world.setVisible(true);

  }
}