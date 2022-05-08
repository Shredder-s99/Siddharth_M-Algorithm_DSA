package com.greatlearning.bst.driver;

import com.greatlearning.bst.service.BinarySearchTree;

import java.util.ArrayList;
import java.util.Scanner;

public class BST {
        public static void main(String []args){
            BinarySearchTree a = new BinarySearchTree();
            BinarySearchTree rightskwedtree = new BinarySearchTree();
            ArrayList<Integer> array = new ArrayList<>();
            Scanner data = new Scanner(System.in);
            int key=0;
            while(key!=-99){
                System.out.println("At anypoint enter -99 to end BST");
                System.out.println("Enter the key for bst");
                key=data.nextInt();
                if(key!=-99 && key>0){
                    a.insert(key);
                }
            }
            a.printBst(a.root,array);
            System.out.println(array);
            for (int x : array){
                rightskwedtree.insert(x);
            }
            rightskwedtree.printRightSkew(rightskwedtree.root);

        }



}
