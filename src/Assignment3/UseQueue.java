package Assignment3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

class Find2{
	
	public int x;
	public int y;
	
	Find2(int x, int y){
		this.x=x;
		this.y=y;
		
	}
	
}

public class UseQueue{
	//bfs이용!!!인덱스 하나하나 관리 x
	
	static int N;
	static int M;
	static int[][] map;
	static boolean flag=true;
	static Queue<Find2> queue = new LinkedList<>();
	static int[] dx = {0,1,-1,0};
	static int[] dy = {1,0,0,-1};
	static Find2 find;
	static int count=0;
	static int j;
	static int z;

	

	public static void main(String[] args) throws IOException {
		

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

		queue.add(new Find2(1,1));//(1.1)부터 시작 
		map[1][1]=2;
		 
		
		while(!queue.isEmpty()) {
			

			find = queue.poll(); //인덱스 관리 하지 않고 , poll해가며 인덱스를 받는다   
			 //왔던길 2로 표시
			
			//막다른 길에 도착했을 때의 작업 
			//출구에 도착햇을 경우 3으로 바꿔주는 작업
			
			if(find.y==N-2 && find.x==M-2) {
			
				count = map[find.y][find.x]; 
				j=N-2;
				z=M-1;
				
				break;
				
				
			}//출구에 도착하면 
			
				Loop2:
				for(int i=0;i<4;i++) {
					if(find.x+dx[i]>=0 && find.y+dy[i]>=0 && find.x+dx[i]<=M-1 && find.y+dy[i]<=N-1) {
						
					int x = find.x+dx[i];
					int y = find.y+dy[i];
					
					
					if(map[y][x]==0) {
						map[y][x]=map[find.y][find.x]+2;
						queue.add(new Find2(x,y));
				

					   }//갈 수 있는 길이면 왔던길을 +2해주면서 표시해줌 
					}
					
					
				}//길 검사하는 for문 

				
	}//while문 끝 
		

		
		while(count>0) {
			//출구부터(밑에서부터) 비교 필수 
			
			for(int i=0;i<4;i++) {
			if(z+dx[i]>=0 && j+dy[i]>=0 && z+dx[i]<=M-1 && j+dy[i]<=N-1) {
				
				int x = z+dx[i];
				int y = j+dy[i];
				
				
				if(map[y][x]==count) {
					
					map[y][x]=3;
					j=y;
					z=x;
					count-=2;
					break;
					
					}
				}

			}//올바른 길을 3으로 표시해주는 while문 

		}
		
		
		
		
		
		
		
		for(int i=0;i<N;i++) {
			for(int w=0;w<M;w++) {
				
				if(map[i][w]==3 ||map[i][w]==1)
					System.out.print(map[i][w]+" ");
				
				else {
					System.out.print("0 ");
				}

			}
			System.out.println();
			
		}//map의 결과 표시해주는 for문
	


		
	
		
	}
}
