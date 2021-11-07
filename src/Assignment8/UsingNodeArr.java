package Assignment8;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//for문 index범위 꼭 확인하기 

class Node{
	
	public char data;
	public Node leftChild;
	public Node rightChild;
	
	Node(char data){
		
		this.data = data;
		this.leftChild = null;
		this.rightChild = null;
		
		
	}



	public Node getLeftChild() {
		return leftChild;
		
	}


	public void setLeftChild(Node leftChild,Node node) {
		this.leftChild = leftChild;
		
	}


	public Node getRightChild() {
		return rightChild;
		
	}


	public void setRightChild(Node rightChild,Node node) {
		this.rightChild = rightChild;
		
	}
	
	public static int search(char data, Node[] arr) {
		
		int index=0;
		boolean flag = false;
		
		for(int i=1;i<UsingNodeArr.nodeCnt;i++) {
			
			//중복되는 데이터 존재
			if(data == arr[i].data) {
				
				index=i;
				flag = true;
				break;

			}
			

		}
		
		//중복되는 데이터 존재x 
		if(!flag) {
			index = UsingNodeArr.nodeCnt;
		}
		
		
		return index;
		
		
		}

	}



class Tree{
	
	public Node root;
	public static Node temp;
	
	//루트 설정
	Tree(Node root){
		this.root = root;
	}
	
	static StringBuilder sb = new StringBuilder();
	
	
	public static void preOrder(Node node) {
		
		//루트 출력 
		System.out.print(node.data);
		
		
		//왼쪽자식 출력 
		if(node.leftChild!=null) {
			preOrder(node.leftChild);
		}
		
		//오른쪽 자식 출력
		if(node.rightChild!=null) {
			preOrder(node.rightChild);
		}
			
		
		
	}
	
	public static void inOrder(Node node) {
		
			
		
		if(node.leftChild!=null) {
			inOrder(node.leftChild);
		}
		
		
		System.out.print(node.data);
			
		
		if(node.rightChild!=null) {
			inOrder(node.rightChild);
		}
		
		
		
}
	//left, right 둘 다 없어야 출력 (left - > right)
	public static void postOrder(Node node) {
		
		//왼쪽자식 출력 
		if(node.leftChild!=null) {
			postOrder(node.leftChild);
		}
	
		//오른쪽 자식 출력
		if(node.rightChild!=null) {
			postOrder(node.rightChild);
		}
				
		System.out.print(node.data);
					
		
	}
	
}

public class UsingNodeArr {
	
	public static Node tempNode;
	public static Node[] arr;
	public static int count=1;
	public static int N;
	public static int arrIndex;
	public static int nodeCnt=1;
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());//이진 트리의 노드의 개수
		
		arr = new Node[N*2+2];
		arrIndex=N*2+2;
		
		
		//A B C입력 
		

		//배열 다 채우기 
		while(N>0) {
			
			String input = br.readLine();
			
			char parent = input.charAt(0);
			char left = input.charAt(2);
			char right = input.charAt(4);
			
			//input.charAt(0)의 중복 여부 검사
			
			int parentIndex = Node.search(parent,arr);
			
			
			//input.charAt(0)이 중복되지 않는 data일 때
			if(parentIndex!=nodeCnt) {
				
				arr[count] = new Node(parent);
				nodeCnt++;
			}
				

			int leftIndex;
			int rightIndex;
			
			for(int i=0;i<nodeCnt;i++) {
				
				//왼쪽 자식이 중복
				if(arr[i].data == left) {
					arr[parentIndex].leftChild = arr[i];
					leftIndex =i;
				}
				
				//오른쪽 자식이 중복
				if(arr[i].data == right) {
					arr[parentIndex].rightChild = arr[i];
				    rightIndex =i;
				}
			}
			
			//왼쪽, 오른쪽 자식 중복 x
			
			if(arr[parentIndex].leftChild==null && left!='.') {
				arr[parentIndex].leftChild = new Node(left);
			}
			
			if(arr[parentIndex].rightChild==null && right!='.') {
				arr[parentIndex].rightChild = new Node(right);
			}
			
			
			
			N--;
			
		
			Tree tree = new Tree(setRoot(arr));
			
			Tree.preOrder(tree.root);
			System.out.println();
			
			Tree.inOrder(tree.root);
			System.out.println();
			
			Tree.postOrder(tree.root);

	}
}
	
	
	//트리의 루트 설정
	public static Node setRoot(Node[] arr) {
		
		int index = 0;
		//데이터 A가 무조건 루트
		for(int i=1;i<nodeCnt;i++) {
			if(arr[i].data=='A') {
				
				index=i;
				
			}
		}
		
		return arr[index];
		
	}
	
}


