package com.gdstruc.module2;

public class playerLinkedList {
    private playerNode head;

    public void addFront(player player)
    {
        playerNode playerNode = new playerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printList() {
        playerNode current = head;

    }
}
