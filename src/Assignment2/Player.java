package Assignment2;
/**
 * This class represents a computer

 * player in the Odd-Even game
 * 
 *  
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random; // import Random to create a random number 



public class Player{
	


   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private double t; 
    private int score;
    private double randomNumber;
    private int number;
    private int winCount=0;
    private int loseCount=0;
   
        
    public Player(double threshold) throws NumberFormatException, IOException{
        
    	t=threshold;
        score=0;
        

    }
    
	public int getWinCount() {
		return winCount;
	}
	
	public void setWinCount(int number) {
		this.winCount = number;
	}
	
	

	public void win() {
		winCount++;
	}

	public int getLoseCount() {
		return loseCount;
	}

	public void lose() {
		loseCount++;
	}

	public void setT(double t) {
		this.t = t;
	}

	public double getT() {
		return t;
	}

	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public double getRandomNumber() {
		return randomNumber;
	}


	public int getNumber() throws NumberFormatException, IOException {
		

		return number;
	}

	public void setNumber() throws NumberFormatException, IOException {
		

	        if(t>=0.0 && t<=1.0) {
	        	randomNumber= (Math.random());
	        	
	        	if(randomNumber>t) {
	        		this.number = 2;
	        	
	        	}//randomNumber가 t보다 크다면 player는 2를 냄.
	        	
	        	else {
	        		this.number = 1;
	        	}//randomNumber가 t보다 크다면 player는 1을 냄.
	        	
	        }//t가 0보다 크고 1보다 작으면 컴퓨터
	        
	        else {
	        	System.out.println("사용자의 input값을 입력하세요: ");
	        	int input=Integer.parseInt(br.readLine());
	        	this.number = input;
	        }//컴퓨터가 아닌 사용자라면 입력을 받음 
		
	}
	
	public void pay(int sum) {
		score-=sum;
		
	}
	
	public void take(int sum) {
		score+=sum;
		
	}
	
	
    
    
    
    
    // If the number is greater than t,
    // the computer will declare “two” if the random number is less than t the computer will declare "one".
    
}
