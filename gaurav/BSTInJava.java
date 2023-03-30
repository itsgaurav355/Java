package com.gaurav;

import java.util.ArrayList;
import java.util.prefs.NodeChangeEvent;

public class BSTInJava    {
    static Node root;
        static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;
            }
        }
        public static Node insert(Node root,int data){
            if(root==null){
                root=new Node(data);
                return root;
            }

            if(root.data >data ){
                //left subtree
                root.left=insert(root.left,data);
            }else{
                root.right=insert(root.right,data);
            }
            return root;
        }
        public static void inOrder(Node root){
            if(root==null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }
        public static boolean search(Node root,int data){
            //Time complexity for each method is O(H) where h is height of the tree
            if(root==null){
                return false;
            }
            if(root.data>data){
              return  search(root.left,data);
            }else if(root.data<data){
             return   search(root.right,data);
            }else{
                return true;
            }
        }
        public static Node delete(Node root,int data){
            if(root.data>data) {
                root.left = delete(root.left, data);
            } else if(root.data<data){
                    root.right=delete(root.right,data);
                }else{
                //root.data==data
                //case 1 no child is remaining
                if(root.left==null & root.right==null){
                    return null;
                }
                //case 2 having only one child
                if(root.left==null){
                    return root.right;
                } else if(root.right==null){
                    return root.left;
                }
                //case 3 Right side leftmost child will be selected (replace value with inorder successor)
                  Node Is = inOrderSuccessor(root.right);
                root.data=Is.data;
                root.right=delete(root.right,Is.data);
            }
            return root;

        }
        public static Node inOrderSuccessor(Node root){
             //Gives the right side tree left most child
            while(root.left!=null){
                root=root.left;
            }
            return root;
        }
        //printing the elements in a given range of min and maximum
        public static void printRange(Node root,int x,int y){
            if(root==null){
                return;
            }
            if(root.data>=x && root.data<=y){
                printRange(root.left,x,y);
                System.out.print(root.data+" ");
                printRange(root.right,x,y);
            }else if(root.data>=y){
                printRange(root.left,x,y);
            }else{
                printRange(root.right,x,y);
            }
        }
        //print all possible path from root to leaf node
    public static void printPath(Node root, ArrayList<Integer> path){
            if(root==null){
                return;
            }
            path.add(root.data);
            //leaf
        if(root.left==null && root.right==null){
            getPath(path);
        } else{
            printPath(root.left,path);
            printPath(root.right,path);
        }
            path.remove(path.size()-1);
        }
    public static void getPath(ArrayList<Integer> path){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i)+"-->");
            }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String[] args) {
        int values[] ={8,5,3,6,10,11,14};
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inOrder(root);
        System.out.println();

      //  delete(root,2);
        inOrder(root);
        System.out.println();
       printPath(root,new ArrayList<>());
    }
}
