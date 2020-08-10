package com.javalearning;
import java.util.Stack;

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

    //Binary Tree constructor
    void BinaryTree(){
        root = null;
    }
    //Inorder traversal - recursive
    void inorder(){
        inorder(root);
    }
    void inorder(Node node){
        if(node == null){
            return;
        }else{
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
    }

    //Inorder traversal - not recursive
    void inorderWr(){
        if(root == null){
            return;
        }else{

            Stack<Node> stack = new Stack<Node>();
            Node curr = root;

            while (curr != null || stack.size() > 0)
            {
                while (curr !=  null)
                {
                    stack.push(curr);
                    curr = curr.left;
                }

                curr = stack.pop();
                System.out.print(curr.data + " ");
                curr = curr.right;
            }
        }
    }
    //Preorder traversal -Recursive
    void preorder(){
        preorder(root);
    }
    void preorder(Node node){
        if(node == null){
            return;
        }else{
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    //Preorder traversal - not recursive
    void preorderWr(){
        if(root == null){
            return;
        }else{

            Stack<Node> stack = new Stack<Node>();
            Node curr = root;

            while (curr != null || stack.size() > 0)
            {

                while (curr !=  null)
                {
                    stack.push(curr);
                    System.out.print(curr.data + " ");
                    curr = curr.left;
                }

                curr = stack.pop();
                curr = curr.right;
            }
        }
    }

    //Postorder traversal - recursive
    void postorder(){
        postorder(root);
    }
    void postorder(Node node){
        if(node == null){
            return;
        }else{
            postorder(node.left);
            postorder(node.right);
            System.out.println(node.data);
        }
    }


    //Preorder traversal - not recursive
    void postorderWr(){
        Stack<Node> stack = new Stack<>();
        while(true) {
            while(root != null) {
                stack.push(root);
                stack.push(root);
                root = root.left;
            }

            if(stack.empty()) return;
            root = stack.pop();

            if(!stack.empty() && stack.peek() == root) root = root.right;

            else {

                System.out.print(root.data + " "); root = null;
            }
        }
    }


    //Main driver program
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Depth First Search Traversal(inorder - recursion) : ");
        tree.inorder();

        System.out.println("\nDepth First Search Traversal(preorder - recursion) : ");
        tree.preorder();

        System.out.println("\nDepth First Search Traversal(postorder - recursion) : ");
        tree.postorder();

        System.out.println("\nDepth First Search Traversal(inorder - without recursion) : ");
        tree.inorderWr();

        System.out.println("\nDepth First Search Traversal(preorder - without recursion) : ");
        tree.preorderWr();

        System.out.println("\nDepth First Search Traversal(postorder - without recursion) : ");
        tree.postorderWr();
    }
}
