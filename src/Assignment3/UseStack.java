package Assignment3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

class Find{
	
	public int x;
	public int y;
	
	Find(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
}

public class UseStack{
	
	
   static int N;
    static int M;
    static int[][] map;
    static boolean flag=true;
    static boolean flag2;
    static Stack<Find> stack = new Stack<>();
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
   
    static Find temp2;
	

	public static void main(String[] args) throws IOException {
		
        //rowIndex, colIndex 하나하나 관리 하는 게 좋지 않음.

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N= Integer.parseInt(st.nextToken());
		M= Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		
		for(int i=0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0;j<M;j++) {
				map[i][j]=Integer.parseInt(st.nextToken());
				
			}
			
			
		}//map 입력받음 
		
		br.close();
		
		
		stack.add(new Find(1,1)); //1,1에서 시작 
		
		
		while(flag) {
			
			flag2=true;
			
			//인덱스 값 하나하나 관리할 필요 없이 stack의 가장 위를 받으면 된다 
			temp2 = stack.peek();
			
			map[temp2.y][temp2.x]=2; //왔던길 2로 표시 (직접적인 인덱스 관리x)
			
		
	
			if(temp2.y==N-2 && temp2.x==M-2) {
				
				while(!stack.isEmpty()) {
					Find temp = stack.pop();
					map[temp.y][temp.x]=3;
				}
					flag = false;
				

			}//출구에 도착하면 스택을 비우며 3으로 바꿔준다.
			
			
				for(int i=0;i<4;i++) {
					
					if(temp2.x+dx[i]>=0 && temp2.y+dy[i]>=0 && temp2.x+dx[i]<=M-2 && temp2.y+dy[i]<=N-2) {
						
					int x = temp2.x+dx[i];
					int y = temp2.y+dy[i];
					
					
					if(map[y][x]==0) {
						
						stack.push(new Find(x,y));
						
						flag2=false;//지금 검사하는 칸 앞,뒤,양,옆 중 하나는 갈 수 있음 
						break;
						
					  	
					   }//검사하는 길이 갈 수 있다면 간다.
					
					}
					
					
				}
				
				
				// 앞,뒤,양,옆 모두 막다른길이라면 pop
				if(flag2) {
					stack.pop();
					
					
					if(!stack.isEmpty()) {
						Find temp3= stack.peek();
						temp2.y= temp3.y;
						temp2.x= temp3.x;
					}
				}
				
		

	}//while문 끝 
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				
				if(map[i][j]==3 || map[i][j]==1) {
					System.out.print(map[i][j]+" ");
				}
				
				else {
					System.out.print("0 ");
				}
				
			}
			System.out.println();
			
		}//map의 결과 표시해주는 for문 
	


	
		
	}
}
