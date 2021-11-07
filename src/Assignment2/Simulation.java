package Assignment2;
import java.io.IOException;


/**
 * This class should run simulations to determine
 * whether or not the Odd-Even game is fair and if
 * not who has the advantage and what is a strategy
 * that will realize that adavantage.
 * 
 * 
 */


public class Simulation{
	
	
    
    public static void main(String[] args) throws NumberFormatException, IOException{
        
        // your code here
    	double randomT1 = Math.random();
    	double randomT2 = Math.random();

   
    	Game g = new Game( randomT1, randomT2 );
    	
    	//0.0부터 1까지 0.01만큼 증가하는 방식으로 
    	for(double i=0.0;i<=1.0;i+=0.01) {
    		
    		g.one= new Player(i);
        	
    		for(double j=0.0;j<=1.0;j+=0.01) {
    			
    			g.two = new Player(j);
    			g.play(5000);
    			
    			
    		}
    		
    		
            
    	}//총 5000판의 게임을 해보면서 player1, player2 누가 더 유리한지 확인.
        
    	
    	//no print, no return 
    	
    	
    	
    	
    }
}
