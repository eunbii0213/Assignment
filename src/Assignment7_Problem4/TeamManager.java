package Assignment7_Problem4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TeamManager {
	
	static Player[] playerArr= new Player[100];
	static int count=0;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
		int input;
		
		do{
			printMenu();
			input=Integer.parseInt(br.readLine());
			
			if(input==5) {
				break;
			}
			
			else if(input==1) {
				
				//Print player list
				
				for(int i=0;i<count;i++) {
					System.out.println(playerArr[i].toString());
				}
			}
			
			else if(input==2) {
				
				System.out.print("Enter player name: ");
				String name = br.readLine();
				
				System.out.println("Enter player position (1 = defender, 2 = midfielder; 3 = forward) : ");
				int number = Integer.parseInt(br.readLine());
				
				switch(number) {
				
				case 1:
					
					playerArr[count] = new Player(name, Position.DEFENDER);
					count++;
					break;
				
				case 2:
					
					playerArr[count] = new Player(name, Position.MIDFIELDER);
					count++;
					break;
					
				case 3:
					
					playerArr[count] = new Player(name, Position.FORWARD);
					count++;
					break;
					
				default:
					break;
				}
				
				
				
			}
			
			else if(input==3) {
				System.out.print("Enter name of player to remove: ");
				String deleteName = br.readLine();
				boolean flag=false;
				
				for(int i=0;i<count;i++) {
					
					if(playerArr[i].name.equals(deleteName)) {
						
						flag=true;
						for(int j=i;j<count;j++) {
							
							playerArr[j]=playerArr[j+1];
							
						}//안쪽 for문 끝
						
						if(flag) {
							count--;
						}
					
					}//if문 끝
				}//바깥 for문 끝
			}//else if문 끝
			
			Loop1:
			if(input==4) {
				System.out.print("Enter name of player to reposition: ");
				String changeName = br.readLine();
				
				System.out.print("Enter new position (1 = defender, 2 = midfielder, 3 = forward): ");
				int number = Integer.parseInt(br.readLine());
				
				Position position;
				
				switch(number) {
				
				case 1:
					position=Position.DEFENDER;
					break;
				
				case 2:
					position=Position.MIDFIELDER;
					break;
					
				case 3:
					position=Position.FORWARD;
					break;
					
				default:
					break Loop1;
				}
				
				for(int i=0;i<count-1;i++) {
					
					if(playerArr[i].name.equals(changeName)) {
						playerArr[i].position = position;
						break;
					}//if문 끝
					
				}//바깥 for문 끝
				
			}//else if문 
			
		}while(true);
	}
	

	public static void printMenu(){
		
		System.out.println();
		System.out.println("Menu:");
		System.out.println("1. Print player list.");
		System.out.println("2. Add player to roster.");
		System.out.println("3. Remove player from roster.");
		System.out.println("4. Change player's position.");
		System.out.println("5. Quit.");
		System.out.print("Enter menu choice: ");
	}

}
