import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;
import java.util.ArrayList;


/**
 * Game of Life starter code. Demonstrates how to create and populate the game using the GridWorld framework.
 * Also demonstrates how to provide accessor methods to make the class testable by unit tests.
 * 
 * @author @Annika Dugad
 * @version 11 Nov 2014
 */
public class GameOfLife
{
    // the world comprised of the grid that displays the graphics for the game
    private ActorWorld world;
    
    // the game board will have 5 rows and 5 columns
    private final int ROWS = 25;
    private final int COLS = 25;
    
    // constants for the location of the three cells initially alive
    private final int X1 = 12, Y1 = 10;
    private final int X2 = 12, Y2 = 11;
    private final int X3 = 12, Y3 = 14;
    private final int X4 = 12, Y4 = 15;
    private final int X5 = 12, Y5 = 16;
    private final int X6 = 11, Y6 = 13;
    private final int X7 = 10, Y7 = 11;

    /**
     * Default constructor for objects of class GameOfLife
     * 
     * @post    the game will be initialized and populated with the initial state of cells
     * 
     */
    public GameOfLife()
    {
        // create the grid, of the specified size, that contains Actors
        BoundedGrid<Actor> grid = new BoundedGrid<Actor>(ROWS, COLS);
        
        // create a world based on the grid
        world = new ActorWorld(grid);
        
        // populate the game
        populateGame();
        
        // display the newly constructed and populated world
        world.show();
        
        
    }
    
    /**
     * Creates the actors and inserts them into their initial starting positions in the grid
     *
     * @pre     the grid has been created
     * @post    all actors that comprise the initial state of the game have been added to the grid
     * 
     */
    private void populateGame()
    {
        // the grid of Actors that maintains the state of the game
        //  (alive cells contains actors; dead cells do not)
        Grid<Actor> grid = world.getGrid();
        
        // create and add rocks (a type of Actor) to the three intial locations
        Rock rock1 = new Rock();
        Location loc1 = new Location(X1, Y1);
        grid.put(loc1, rock1);
        
        Rock rock2 = new Rock();
        Location loc2 = new Location(X2, Y2);
        grid.put(loc2, rock2);
        
        Rock rock3 = new Rock();
        Location loc3 = new Location(X3, Y3);
        grid.put(loc3, rock3);
        
        Rock rock4 = new Rock();
        Location loc4 = new Location(X4, Y4);
        grid.put(loc4, rock4);
        
        Rock rock5 = new Rock();
        Location loc5 = new Location(X5, Y5);
        grid.put(loc5, rock4);
        
        Rock rock6 = new Rock();
        Location loc6 = new Location(X6, Y6);
        grid.put(loc6, rock4);
        
        Rock rock7 = new Rock();
        Location loc7 = new Location(X7, Y7);
        grid.put(loc7, rock4);
        
    }

    /**
     * Generates the next generation based on the rules of the Game of Life and updates the grid
     * associated with the world
     *
     * @pre     the game has been initialized
     * @post    the world has been populated with a new grid containing the next generation
     * 
     */
    public void createNextGeneration()
    {
        /** You will need to read the documentation for the World, Grid, and Location classes
         *      in order to implement the Game of Life algorithm and leverage the GridWorld framework.
         */
        
        // create the grid, of the specified size, that contains Actors

        Grid<Actor> grid = world.getGrid();
        ArrayList<Location> location = grid.getOccupiedLocations();
        ArrayList<Location> live = new ArrayList<Location>();
        ArrayList<Location> die = new ArrayList<Location>();
        
        for(int i =0; i<location.size(); i++)
        {
            Location neighbor = location.get(i);
            ArrayList<Location> neighbor1 = grid.getEmptyAdjacentLocations(neighbor);
            for(int j =0; j<neighbor1.size();j++)
            {
                Location local = neighbor1.get(j);
                ArrayList<Location> cell = grid.getOccupiedAdjacentLocations(local);
                int num = cell.size();
                if (num ==3)
                {
                    live.add(local);
                }
            }
            
            ArrayList<Location> neighbor2 = grid.getOccupiedAdjacentLocations(neighbor);
            int num1 = neighbor2.size();
            if(num1 < 2 || num1 > 3)
            {
                die.add(neighbor);
            }
        }
        
        for (int i =0; i<live.size(); i++)
        {
            Location loc = live.get(i);
            Rock rock = new Rock();
            grid.put(loc,rock);
        }
        for (int j =0; j<die.size(); j++)
        {
            Location loc = die.get(j);
            grid.remove(loc);
        }
    }

    /**
     * Generates and updates the grid associated with the world
     *
     * @pre     the game has been initialized
     * 
     */
    public void gettheGrid()
    {
        Grid<Actor> grid = world.getGrid();
        world.setGrid(grid);
    }
    
    /**
     * Returns the actor at the specified row and column. Intended to be used for unit testing.
     *
     * @param   row the row (zero-based index) of the actor to return
     * @param   col the column (zero-based index) of the actor to return
     * @pre     the grid has been created
     * @return  the actor at the specified row and column
     */
    public Actor getActor(int row, int col)
    {
        Location loc = new Location(row, col);
        Actor actor = world.getGrid().get(loc);
        return actor;
    }

    /**
     * Returns the number of rows in the game board
     *
     * @return    the number of rows in the game board
     */
    public int getNumRows()
    {
        return ROWS;
    }
    
    /**
     * Returns the number of columns in the game board
     *
     * @return    the number of columns in the game board
     */
    public int getNumCols()
    {
        return COLS;
    }
    
    
    /**
     * Creates an instance of this class. Provides convenient execution.
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        GameOfLife game = new GameOfLife();
        boolean condition = true;
        while(condition)
        {
            Thread.sleep(1000);
            game.createNextGeneration();
            game.gettheGrid();
        }
    }

}
