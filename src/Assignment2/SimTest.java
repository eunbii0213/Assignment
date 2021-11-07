package Assignment2;

import java.io.IOException;

/**
 * This is a sample tester for Part 2 of your program
 * We will use something similar to this to test your work
 * Your program must work with this tester
 * 
 * @author Cannon 
 */

public class SimTest{
    public static void main(String[] args) throws NumberFormatException, IOException{
        //instantiate a game with two computer players
        Game g = new Game(.5,.5); 
        g.play(1000); // play 1000 games. Please, no print statements.
        System.out.println("Player 1 now has "+ g.getP1Score()+" tokens.");
        System.out.println("Player 2 now has "+ g.getP2Score()+" tokens.");
    }
}