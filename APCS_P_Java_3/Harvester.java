import kareltherobot.*; 

public class Harvester extends Robot
{
    //Constructor method that utilizes the constructor method of the super class (UrRobot)
    public Harvester(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);

    }
    
    public void harvestTwoRows() {
        //Before executing this, the robot needs to be facing east
        //Also, the robot must be on the first beeper of the current row
        
        //Your code goes here.
    }
    
    private void positionForNextHarvest() {
        //Before executing this, the robot should be facing west, on the last 
        // corner of the current row.  After executing this, the robot should be facing east
        // on a corner of a row that is ready to harvest.
        
        //Your code goes here
    }
    
    private void turnRight() {
        //Your code goes here
    }
    
    private void harvestOneRow() {
        //The robot should pick all beepers in the given row
        
        //your code goes here
    }
    
    private void harvestCorner() {
        //Picks up a beeper on a given corner
        
    }
    
    private void goToNextRow() {
        //Before executing this, the robot should be facing East on the last corner
        // of the current row.  After executing this, the robot should be facing west
        // on the last corner of the row above it just harvested.
        
        //your code goes here
    }
}

