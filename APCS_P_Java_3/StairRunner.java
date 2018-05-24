/**
   @Author:
      Date:
   Teacher:
       Lab:
      Misc:
  */
import kareltherobot.*;
import java.awt.Color;

public class StairRunner implements Directions
{
    public static void main(String args[])  {
        SuperKarel karel = new SuperKarel(1, 1, East, 0);  
        
        karel.turnOff();  
    } 

    static {
        World.reset(); 
        World.readWorld("fig3-1.kwld"); 
        World.setBeeperColor(Color.magenta);
        World.setStreetColor(Color.blue);
        World.setNeutroniumColor(Color.green.darker());
        World.setDelay(50);  
        World.setVisible(true);
    }
}