package com.gdstruc.module2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {

	    List<Player> playerList = new ArrayList<>();

        playerList.add(new Player(1,"Nox" , 69));
        playerList.add(new Player(2, "Lymtex", 178));
        playerList.add(new Player(3, "JT", 447));

        //playerList.add(2, new player(55, "Michael", 95));
        //playerList.remove(2);

        //System.out.println(playerList.contains(new player(2, "Lymtex", 178)));//finding player
        //System.out.println(playerList.indexOf(new player(3,"JT", 447)));//finding index or array number

        //for(player p : playerList)
        //{
        //    System.out.println(p);
        //}


    }


}
