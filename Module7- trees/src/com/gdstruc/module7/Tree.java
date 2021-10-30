package com.gdstruc.module7;

public class Tree {
    private Node root;

    public void insert(int value){
        if(root == null){
            root = new Node(value);
        }
        else{
            root.insert(value);
        }
    }

    public void inOrder(){
        if (root != null){
            root.inOrder();
        }
    }

    public void inDescendingOrder(){
        if (root != null){
            root.inDescendingOrder();
        }
    }
}
