package Assignment3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class UseRecursion {

	static int N;
	static int M;
	static int[][] map;
	static boolean flag=true;

	static int[] dx = {1,0,-1,0};
	static int[] dy = {0,1,0,-1};
	
	
	public static void re(int rowIndex, int colIndex) {
		
		map[rowIndex][colIndex]=2;
		
		if(rowIndex == N-2 && colIndex == M-2) {
			flag = false;
		}
		
		for(int i=0;i<4;i++) {
			int x = colIndex + dx[i];
			int y = rowIndex + dy[i];
			
			if (flag && map[y][x]==0) {

				re(y,x);
			}//갈 수 있으면 그 자리에서 다시 길찾기
			
		}

		if(!flag) {
			
			map[rowIndex][colIndex]=3;
		}

		
	}
	

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

		
		re(1,1);
		
		
		for(int i=0;i<N;i++) {
			
			for(int j=0;j<M;j++) {
				System.out.print(map[i][j]);
				
			}
			
			System.out.println();
		}//map 입력받음 
		
	}
}
