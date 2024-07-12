package dataStructureLearningTree;

import learningLinkedList.Node;

class Tree{
	int data;
	Tree left,right;
	public Tree(int data) {
		// TODO Autos-generated constructor stub
		this.data=data;
		left=null;
		right=null;
		
	}
}

class InorderPreorderPostorderTraversal {
	
	Tree root;
	
	public  void insert(int data) {
	
		root=helper(root,data);
		
		
		
	}
	
	public static Tree helper(Tree root,int data) {
		if(root==null) {
			root=new  Tree(data);
		}
		else if(root.data>data) {
			root.left=helper(root.left, data);
		}
		else if(root.data<data) {
			root.right=helper(root.right, data);
		}
		
		
		return root;
	}
	
	
	static void printInorder(Tree rootNode) {
		if(rootNode==null) {
//			System.out.println(rootNode.data);
			return;
		}
		
		printInorder(rootNode.left);
		System.out.print(rootNode.data+" ");
		printInorder(rootNode.right);
	}
	static void printPreorder(Tree rootNode) {
		if(rootNode==null) {
//			System.out.println(rootNode.data);
			return;
		}
		System.out.print(rootNode.data+" ");
		printPreorder(rootNode.left);
		printPreorder(rootNode.right);
	}
	static void printPostorder(Tree rootNode) {
		if(rootNode==null) {
//			System.out.println(rootNode.data);
			return;
		}
		printPostorder(rootNode.left);
		printPostorder(rootNode.right);
		System.out.print(rootNode.data+" ");
		
	}
	
	public Tree searchNode(Tree root,int data) {
		
		root=helperToSearch(root, data);
		
		return root;
		
	}
	
	static Tree helperToSearch(Tree root,int data) {
		if(root!=null) {
		if(root.data==data) {
			return root;
		}
		else if (root.data>data) {
			return helperToSearch(root.left, data);
			
		}else if(root.data<data) {
			return helperToSearch(root.right, data);
		}
		}
		
		return null;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Tree rootNode = new Tree(1);
//		rootNode.left=new Tree(2);
//		rootNode.left.left=new Tree(4);
//		rootNode.left.right=new Tree(5);
//		rootNode.right=new Tree(3);
//		rootNode.right.right=new Tree(6);
		InorderPreorderPostorderTraversal bst=new InorderPreorderPostorderTraversal();
		bst.insert(4);
		bst.insert(2);
		bst.insert(1);
		bst.insert(3);
		bst.insert(7);
		bst.insert(5);
		
		
		
		
		//System.out.println("Root data "+bst.root.data);
		
		System.out.print("InOrder   : ");
		printInorder(bst.root);
		System.out.print("\n\nPreOrder  : ");
		printPreorder(bst.root);
		System.out.print("\n\nPostOrder : ");
		printPostorder(bst.root);
		
		Tree subTreenNode=bst.searchNode(bst.root, 9);
		
		System.out.print("\n\nInOrder   : ");
		printInorder(subTreenNode);
		System.out.print("\n\nPreOrder  : ");
		printPreorder(subTreenNode);
		System.out.print("\n\nPostOrder : ");
		printPostorder(subTreenNode);
		
		
		
		

	}

}
