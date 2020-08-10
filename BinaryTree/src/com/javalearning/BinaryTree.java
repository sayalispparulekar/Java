package com.javalearning;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
public class BinaryTree {

    Node root;

    void BinaryTree(){
        root = null;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.root.data);
        System.out.println(tree.root.left.data);
        System.out.println(tree.root.right.data);
        System.out.println(tree.root.left.left.data);



    }
}
