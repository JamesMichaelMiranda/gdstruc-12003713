package com.gdstruc.module2;

public class PlayerLinkList {
    private PlayerNode head;

    public void addToFront(Player player)
    {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList(){
        PlayerNode current = head;
        System.out.println("Head -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
