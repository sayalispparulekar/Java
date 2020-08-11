package com.javalearning;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
//Binary Tree implementation using array
class Array_imp {
    int root = 0;
    String[] str = new String[10];

    /*create root*/
    public void Root(String key)
    {
        str[0] = key;
    }

    /*create left son of root*/
    public void set_Left(String key, int root)
    {
        int t = (root * 2) + 1;

        if (str[root] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        }
        else {
            str[t] = key;
        }
    }

    /*create right son of root*/
    public void set_Right(String key, int root)
    {
        System.out.println();
        int t = (root * 2) + 2;

        if (str[root] == null) {
            System.out.printf("Can't set child at %d, no parent found\n", t);
        }
        else {
            str[t] = key;
        }
    }

    public void print_Tree()
    {
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (str[i] != null)
                System.out.print(str[i]);
            else
                System.out.print("-");
        }
    }
}

public class BinaryTree {

    Node root;

    void BinaryTree(){
        root = null;
    }

    void printTree(){
        int h = height(root);
        for(int i = 0; i <= h; i++){
            printLevel(root, i);
        }
    }
    int height(Node node){
        if(node == null)
            return 0 ;
        else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);

            if (lHeight > rHeight)
                return (lHeight + 1);
            else
                return(rHeight + 1);
        }
    }
    void printLevel(Node node, int level){
        if(node == null){
            return;
        }else if(level == 1){
            System.out.print(node.data + " ");
        }else if(level > 1){
            printLevel(node.left, level - 1);
            printLevel(node.right, level - 1);
        }
    }
    static void insert(Node temp, int key)
    {
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);

        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();

            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }
    //Insertion with recursion
    public static Node insertR(Node root,int data) {
        if(root==null)
        {
            Node node=new Node(data);
            root=node;
        }
        else if(root.data>data)
            root.left=insertR(root.left,data);
        else if(root.data<data)
            root.right=insertR(root.right,data);

        return root;
    }


    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.printTree();
        insert(tree.root, 8);
        System.out.println();
        tree.printTree();

        insert(tree.root, 20);
        System.out.println();
        tree.printTree();

        Array_imp obj = new Array_imp();
        obj.Root("A");
        // obj.set_Left("B", 0);
        obj.set_Right("C", 0);
        obj.set_Left("D", 1);
        obj.set_Right("E", 1);
        obj.set_Left("F", 2);
        obj.print_Tree();
    }
}
