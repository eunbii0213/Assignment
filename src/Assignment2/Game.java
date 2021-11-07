package Assignment2;
import java.io.IOException;

/**
 * This class represents the Odd-Even game
 * 
 * 
 */

public class Game{
    
    // **** Instance variables
	Player one;
	Player two;


/* this version of the game constructor is for Part 1
 * it takes no parameters */
    public Game() throws NumberFormatException, IOException{
        one = new Player(0.5);//computer
        two = new Player(-1);//human
    }
    
/* this version of the game constructor is for Part 2
 * It requires two doubles as parameters. You will use 
 * these to set the initial thresholds for you computer players */
    public Game (double t1, double t2) throws NumberFormatException, IOException{
       
    	one = new Player(t1);
        two = new Player(t2);
    }
    
/* this version of the play method is for Part 1
 * It takes no parameters and should play one interactive
 * version of the game */
    public void play() throws NumberFormatException, IOException{
        
    	one.setNumber();
    	two.setNumber();
    	
    	int sum= one.getNumber()+two.getNumber();
        
        if(sum%2==0) {
        	one.pay(sum);
        	two.take(sum);
        }//짝수라면 two가 win
        
        else {
        	one.take(sum);
        	two.pay(sum);
        }
        
        System.out.println(one.getNumber()+" "+two.getNumber());
        System.out.println(one.getScore()+" "+two.getScore());
    }
    
    
/** this version of the play method is for Part 2
 * It takes a single int as a parameter which is the
 * number of computer vs. computer games that should be played 
 * @throws IOException 
 * @throws NumberFormatException */
    public void play(int games) throws NumberFormatException, IOException{
    	
    	 // your code here
    	one.setScore(0);
    	two.setScore(0);

    		for(int j=0;j<games;j++) {
    			
	    	one.setNumber();
	    	two.setNumber();
	    	
	    	int sum= one.getNumber()+two.getNumber();
	        
	        if(sum%2==0) {
	        	
	        	one.pay(1);
	        	two.take(1);
	        	//System.out.println(one.getNumber()+" "+two.getNumber());
	        	
	        }//짝수라면 two가 win
	        
	        else {
	        	one.take(1);
	        	two.pay(1);

	        }//홀수라면 one이 win 
    	}
    		
    		//no print, no return but access the current amount of tokens either player
        	
     }
    	

/* this method should return the current score (number of tokens)
 * that player 1 has */
    public int getP1Score(){
        // your code here
        return one.getScore();
    }
    
/* this method should return the current score (number of tokens)
 * that player 2 has */
    public int getP2Score(){
        // your code here
    	return two.getScore();
        
    }  
    
    
    // you may or may not want more methods here:
    
    
}
