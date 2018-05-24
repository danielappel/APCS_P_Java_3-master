/**
   @Author:
      Date:
   Teacher:
       Lab: Karel Problem Set #2
      Problem: Implement your harvester solution using more rows
  */
import kareltherobot.*;
import java.awt.Color;

public class MoreRowsRunner implements Directions
{
    public static void main(String args[])  {
        Harvester karel = new Harvester(2, 1, East, 0);  
       
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("fig3-3b.kwld"); 
        World.setBeeperColor(Color.black);
        World.setStreetColor(Color.black);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(10);  
        World.setVisible(true);
    }
}