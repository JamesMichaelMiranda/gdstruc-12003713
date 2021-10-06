package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

	    List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1,"Nox" , 69));
        //playerList.add(new Player(2, "Lymtex", 178));
        //playerList.add(new Player(3, "JT", 447));

        //playerList.add(2, new Player(55, "Michael", 95));
        //playerList.remove(2);

        //for(Player p : playerList)
        //{
        //    System.out.println(p);
        //}

        Player nox = new Player(1, "Nox", 46);
        Player lymtex = new Player(2,"Lymtex", 576);
        Player jt = new Player(3, "JT", 47);

        playerLinkedList.printList(playerList.contains(nox));

    }


}
