package dataStructureLearningTree;

import java.util.LinkedList;
import java.util.Queue;

public class DeptFirstAndBreadthFirstSearch {
	
	static void dfs(Tree root) {
		System.out.print(root.data+" ");
		if(root.left!=null) {
			dfs(root.left);
		}
		if(root.right!=null) {
			dfs(root.right);
		}
	}
	
	static void bfs(Tree root) {
	    if (root == null) {
	        return;
	    }
	    
	    Queue<Tree> queue = new LinkedList<>();
	    queue.add(root);
	   
	    while (!queue.isEmpty()) {
	        Tree currentNode = queue.poll();
	        System.out.print(currentNode.data+" ");
	        
	        if (currentNode.left != null) {
	            queue.add(currentNode.left);
	        }
	        
	        if (currentNode.right != null) {
	            queue.add(currentNode.right);
	        }
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree rootNode = new Tree(1);
		rootNode.left=new Tree(2);
		rootNode.left.left=new Tree(4);
		rootNode.left.right=new Tree(5);
		rootNode.right=new Tree(3);
		rootNode.right.right=new Tree(6);
		System.out.println("Dept first Search :");
		dfs(rootNode);
		System.out.println("Breadth first Search :");
		bfs(rootNode);
	}

}
