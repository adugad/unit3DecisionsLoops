import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @Annika Dugad
 * @version 11 November 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    10 11 12 13 14 15 16
         *  10 - X  -  -  -  -  -
         *  11 - -  -  X  -  -  -
         *  12 X X  -  -  X  X  X
         *  13 - -  -  -  -  -  -
         *  14 - -  -  -  -  -  -
         *  
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 12 && col == 10) ||
                        (row == 10 && col == 11) ||
                        (row == 12 && col == 11) ||
                        (row == 11 && col == 13) ||
                        (row == 12 && col == 14) ||
                        (row == 12 && col == 15) ||
                        (row == 12 && col == 16))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }

    @Test
    public void testFinalState()
    {
        /* expected pattern for final state (after 3 generations)
         *  (X: alive; -: dead)
         * 
         *    10 11 12 13 14 15 16
         *  10 - -  X  -  X  -  -
         *  11 X X  -  X  X  X  -
         *  12 - -  -  X  -  -  X
         *  13 - -  -  -  X  X  -
         *  14 - -  -  -  -  -  -
         *  
         */
        GameOfLife game = new GameOfLife();
        for(int i=0;i<3;i++)
        {
            game.createNextGeneration();
        }
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int col = 0; col < COLS; col++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Actor cell = game.getActor(row, col);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if(     (row == 11 && col == 10) ||
                        (row == 11 && col == 11) ||
                        (row == 10 && col == 12) ||
                        (row == 11 && col == 13) ||
                        (row == 12 && col == 13) ||
                        (row == 10 && col == 14) ||
                        (row == 11 && col == 14) ||
                        (row == 13 && col == 14) ||
                        (row == 11 && col == 15) ||
                        (row == 13 && col == 15) ||
                        (row == 12 && col == 16))
                {
                    assertNotNull("expected alive cell at (" + row + ", " + col + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + col + ")", cell);
                }
            }
        }
    }
}

