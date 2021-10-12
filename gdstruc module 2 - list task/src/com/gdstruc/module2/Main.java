package com.gdstruc.module2;

public class Main {

    public static void main(String[] args) {

        Player sandstorm = new Player(1, "Sandstorm", 46);
        Player jt = new Player(2,"JT",27);
        Player eggsoup = new Player(3,"Eggsoup", 68);
        Player swerpy =new Player(4, "Swerpy", 24);
        Player ash = new Player(5, "Ash", 70);
        Player bunny =new Player(6, "Bunny", 48);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(sandstorm);
        playerLinkedList.addToFront(ash);
        playerLinkedList.addToFront(bunny);
        playerLinkedList.addToFront(jt);
        playerLinkedList.addToFront(eggsoup);
        playerLinkedList.addToFront(swerpy);

        playerLinkedList.remove(swerpy);//removes a player

        playerLinkedList.size();//displays the size

        playerLinkedList.contains(pikachu);// see's if there is an element

        playerLinkedList.indexOf(ash);//see's instance of an element

    }
}
