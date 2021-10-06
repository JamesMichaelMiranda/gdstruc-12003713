package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1,"Sandstorm", 50));
        playerList.add(new Player(2, "Eggsoup", 178));
        playerList.add(new Player(3, "JT", 447));
        playerList.add(new Player(4, "Swerpy", 24));
        playerList.add(new Player(5, "Ash", 70));
        playerList.add(new Player(6, "Bunny", 48));

        playerList.remove(0); // removes the first element

        for(Player p : playerList){
            System.out.println(p);
        }

        System.out.println("List size:" + playerList.size()); // shows the size of the elements present

        System.out.println(playerList.contains("Pikachu"));

        int index = playerList.indexOf(10);

        if(index == - 1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index " + index);
        }
        
    }
}
