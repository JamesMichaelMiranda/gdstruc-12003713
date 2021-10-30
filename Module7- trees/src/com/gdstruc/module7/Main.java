package com.gdstruc.module7;

public class Main {

    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.insert(10);
        tree.insert(47);
        tree.insert(37);
        tree.insert(28);
        tree.insert(49);
        tree.insert(59);
        tree.insert(38);
        tree.insert(96);

        tree.inOrder();

        System.out.println(tree.getMin());//gets the smallest value from the tree

        System.out.println(tree.getMax());//gets the biggest value from the tree

        tree.inDescendingOrder();// traverses the tree in Descending order
    }
}
