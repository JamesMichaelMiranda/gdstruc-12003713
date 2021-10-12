package com.gdstruc.module2;

public class PlayerLinkedList {
    private PlayerNode head;

    public void addToFront(Player player){
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void remove(Player player){
        System.out.println("You have removed " + head);
    }

    public void size(){
        int players = 5;
        System.out.println("There are " + players + " elements");
    }

    public void contains(Player player){
        if(player = true){
            System.out.println(player);
        }
        else{
            System.out.println("No element found");
        }
    }

    String eggsoup;
    String sandstorm;
    String ash;
    String bunny;
    String jt;
    public void indexOf(Player player){
        if(player = eggsoup){
            System.out.println("1");
        }
        else if(player = jt){
            System.out.println("2");
        }
        else if(player = bunny){
            System.out.println("3");
        }
        else if(player = ash){
            System.out.println("4");
        }
        else {
            System.out.println("5");
        }
    }

    public void printList(){
        PlayerNode current = head;
        System.out.println("Head -> ");
        while(current != null){
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
