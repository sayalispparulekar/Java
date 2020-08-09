package com.javalearning;

class Node{
    int data ;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTree {

    Node root;

    public BinaryTree(){
        root = null;
    }

    void PrintTree(){
        int h = Height(root);
        for(int i = 0; i <= h; i++){
            printLevel(root, i);
        }
    }

    int Height(Node root){

        if (root == null){
            return 0;
        }else{

            int leftH = Height(root.left);
            int rightH = Height(root.right);

            if(leftH > rightH ){
                return(leftH + 1);
            }else{
                return(rightH + 1);
            }
        }

    }

    void printLevel(Node root, int level){
        if(root == null){
            return;
        }else if(level == 1){
            System.out.println(root.data);
        }else if(level > 1){
            printLevel(root.left, level - 1);
            printLevel(root.right, level - 1);
        }
    }
    public static void main(String[] args) {

     BinaryTree tree = new BinaryTree();
	 tree.root = new Node(30);
	 tree.root.left = new Node(35);
	 tree.root.right = new Node(40);
	 tree.root.left.left = new Node(36);
	 tree.root.left.right = new Node(39);

	 System.out.println("Breadth First Search Traversal :");
	 tree.PrintTree();

    }
}