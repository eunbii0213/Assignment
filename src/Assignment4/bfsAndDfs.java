package Assignment4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

//bfs는 queue. dfs는 stack이용!!

class Graph {

    class Node {

        int data;
        LinkedList<Node> adjacent; //인접한 노드를 담음.
        boolean visit; //방문여부 체크해주는 변수
        boolean visit2;

        Node(int data) {
            this.data = data;
            this.visit = false;
            this.visit2 = false;
            adjacent = new LinkedList<Node>();

        }//Dat,인접한 노드(Linked List)를 받고 방문여부 false, LinkedList준비!

    }

    Node[] nodes; //노드를 저장할 배열

    Graph(int size) {
        nodes = new Node[size]; //노드의 개수를 받고 그 개수만큼 배열 만듬

        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }//배열에 노드의 data, 방문여부, 인접한 노드(Linked List)의 정보를 넣음


    }

    void addEdge(int index1, int index2) {

        Node n1 = nodes[index1];
        Node n2 = nodes[index2];

        int i;
        if (!n1.adjacent.contains(n2)) {
            for (i = 0; i < n1.adjacent.size(); i++) {
                if (n1.adjacent.get(i).data >= n2.data) {
                    break;
                }
            }
            n1.adjacent.add(i, n2);
        }//n1주변에 n2가 추가되지 않았으면 추가한다

        if (!n2.adjacent.contains(n1)) {
            for (i = 0; i < n2.adjacent.size(); i++) {
                if (n2.adjacent.get(i).data >= n1.data) {
                    break;
                }
            }
            n2.adjacent.add(i, n1);
        }//그리고 그 반대의 경우에도 추가해줘야한다

    }//노드 끼리의 관계를 정해줄 함수 (index1과 index2는 연결관계에 있음을 지정)


    void dfs(int index) {


        Node root = nodes[index];
        Stack<Node> stack = new Stack<Node>();
        stack.push(root); //현재 노드 스택에 추가
        root.visit = true; //방문함
        System.out.print(root.data + " ");

        boolean flag;
        while (!stack.isEmpty()) {
            Node r = stack.peek();//꺼냄

            flag = true;
            for (int i = 0; i < r.adjacent.size(); i++) {
                Node n = r.adjacent.get(i);
                if (!n.visit) {
                    n.visit = true;
                    stack.push(n);
                    System.out.print(n.data + " ");
                    flag = false;
                    break;
                }//방문하지 않은 노드라면(=스택에 넣은 적이 없는 노드라면) 방문여부를 바꿔주고 스택에 넣음

            }//r의 인접 노드들을 모두 처리하는 for문

            if (flag) {
                stack.pop();
            }
        }//스택이 다 빌때까지 데이터꺼내고 출력한다


    }//dfs.index노드부터 검사 시작


    void bfs(int index) {
        Node root = nodes[index];
        Queue<Node> queue = new LinkedList<Node>();//큐 준비
        queue.add(root);//루트를 넣는다
        root.visit2 = true;//방문했다고 바꿔준다

        while (!queue.isEmpty()) {

            Node r = queue.poll();
            System.out.print(r.data + " ");

            for (Node n : r.adjacent) {
                if (n.visit2 == false) {
                    n.visit2 = true;
                    queue.add(n);

                }//dfs에서처럼 r의 인접노드중에서 방문하지 않은 노드만 add

            }

        }


    }


}


public class BfsAndDfs {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        Graph graph = new Graph(N + 1);

        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());


        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());
            int node1 = Integer.parseInt(st.nextToken());
            int node2 = Integer.parseInt(st.nextToken());

            graph.addEdge(node1, node2);

        }

        //작은 노드를 먼저 가도록 설정하려면 정렬이 필요한 것 같은데 어떻게 해야할까요 ;ㅅ;….?


        graph.dfs(V);

        System.out.println();

        graph.bfs(V);

    }


}
