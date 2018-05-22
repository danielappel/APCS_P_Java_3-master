/**
   @Author:
      Date:
   Teacher:
       Lab:  Harvester Problem with OOD
      Misc:  This task focuses on the design of your program.  Not just accomplishing the final result
  */
import kareltherobot.*;
import java.awt.Color;

public class HarvesterDriver implements Directions
{
    public static void main(String args[])  {
        Harvester hellen = new Harvester(2, 2, East, 0);  
        
        
        
        hellen.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("fig3-2.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}