package com.gdstruc.module5;

public class Main {

    public static void main(String[] args) {

        Player sandstorm = new Player(11,"SandStorm", 234);
        Player shwerpy = new Player(12, "Shwerpy", 345);
        Player eggsoup = new Player(13,"Eggsoup", 565);
        Player jt = new Player(14,"JT", 23);
        Player reb = new Player(15,"Reb", 234);

        SimpleHashTable hashTable = new SimpleHashTable();

        hashTable.put(sandstorm.getUsername(), sandstorm);
        hashTable.put(shwerpy.getUsername(), shwerpy);
        hashTable.put(eggsoup.getUsername(), eggsoup);
        hashTable.put(jt.getUsername(), jt);
        hashTable.put(reb.getUsername(), reb);

        //hashTable.printHashTable();
        System.out.println(hashTable.remove("eggsoup"));

    }
}
