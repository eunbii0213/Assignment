package Assignment6;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
    char item;
    Node leftChild;
    Node rightChild;

    Node(char item) {
        this.item = item;
    }
}

class Tree {
    Node root;

    Tree(Node root) {
        this.root = root;
    }

    //return type이 stringBuilder일 수도 있구낭 
    StringBuilder getPreorder(Node node, StringBuilder sb) {
        if (node != null) {
            sb.append(node.item);
            getPreorder(node.leftChild, sb);
            getPreorder(node.rightChild, sb);
        }
        return sb;
    }

    StringBuilder getInorder(Node node, StringBuilder sb) {
        if (node != null) {
            getInorder(node.leftChild, sb);
            sb.append(node.item);
            getInorder(node.rightChild, sb);
        }
        return sb;
    }

    StringBuilder getPostorder(Node node, StringBuilder sb) {
        if (node != null) {
            getPostorder(node.leftChild, sb);
            getPostorder(node.rightChild, sb);
            sb.append(node.item);
        }
        return sb;
    }
}

public class TreeTraversal {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        //n개의 노드를담을 배열 
        Node[] nodes = new Node[n];
        
        int nodeCnt = 0, idx = 0;
        
        char item, left, right;
        
        String input;
        
        for (int i = 0; i < n; i++) {
        	
            input = br.readLine();
            //노드를 바로 만들지 않고 아이템, 왼쪽자식이 가진 아이템, 오른쪽 자식이 가진 아이템 저장
            item = input.charAt(0);
            left = input.charAt(2);
            right = input.charAt(4);

            boolean flag = true;
            //노드배열에 이미 그 데이터가 있는지 검사하고 있으면 idx를(현재위치를) 그 자리로 바꿈 
            for (int j = 0; j < nodeCnt; j++) {
                if (nodes[j].item == item) {
                    idx = j;
                    flag = false;
                    break;
                }
            }
            
            //노드배열에 그 데이터가 없었다면 idx = nodeCnt, nodeCnt증가, nodes배열에 그 아이템을 가진 새로운 노드 만들어서 저장 
            if (flag) {
                idx = nodeCnt;
                nodes[nodeCnt++] = new Node(item);
            }
            
            //지금 node(nodes[idx])의 왼쪽(오른쪽)데이터와 똑같다면 부모가 같다는것(중복인경우 처리)
            for (int j = 0; j < nodeCnt; j++) {
                if (left == nodes[j].item) {
                    nodes[idx].leftChild = nodes[j];
                } else if (right == nodes[j].item) {
                    nodes[idx].rightChild = nodes[j];
                }
            }
            
            //leftChild가 있는데 아직 추가되지 않았다면 node만들고 추가해줌 
            if (nodes[idx].leftChild == null && left != '.') {
                nodes[nodeCnt++] = new Node(left);
                nodes[idx].leftChild = nodes[nodeCnt - 1];
            }

            //rightChild가 있는데  아직 추가되지 않았다면 node만들고 추가해줌
            if (nodes[idx].rightChild == null && right != '.') {
                nodes[nodeCnt++] = new Node(right);
                nodes[idx].rightChild = nodes[nodeCnt - 1];
            }
        }
        
        br.close();

        Tree tree = new Tree(nodes[0]);
        
        System.out.println(tree.getPreorder(tree.root, new StringBuilder()).toString());
        System.out.println(tree.getInorder(tree.root, new StringBuilder()).toString());
        System.out.println(tree.getPostorder(tree.root, new StringBuilder()).toString());
    }
}