package com.greatlearning.bst.service;

import java.util.ArrayList;

public class BinarySearchTree {

    public class Node {
        public int key ;
        public Node left = null;
        public Node right = null ;

        public Node(int item)
        {
            key = item;
            left = right = null;
        }
    }

    public Node root;
    public void printBst(Node a, ArrayList<Integer> array){
        if(a!=null)
        {
            printBst(a.left,array);
            array.add(a.key);
            printBst(a.right,array);
        }

    }
    public void printRightSkew(Node a){
        if(a!=null){
            System.out.println(a.key);
            printRightSkew(a.left);
            printRightSkew(a.right);
        }
    }


    public BinarySearchTree() { root = null; }


    public void insert(int key) { root = insertRec(root, key); }
    Node insertRec(Node root, int key)
    {
        if (root == null) {
            root = new Node(key);
            return root;
        }
        if (key <= root.key){
            root.left = insertRec(root.left, key);
        }
        else if (key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

}
