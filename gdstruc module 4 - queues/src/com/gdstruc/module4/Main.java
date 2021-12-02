package com.gdstruc.module4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(7);

        queue.add(new Player(1,"Nox", 20));
        queue.add(new Player(2,"Steven", 46));
        queue.add(new Player(3,"Var", 56));
        queue.add(new Player(4, "JT", 78));
        queue.add(new Player(5, "Lymtex", 80));

        int min = 1;
        int max = 5;
        int randomNumber = (int)Math.floor(Math.random()*(max-min+1)+min);


        if (randomNumber != 5) {
            System.out.println("You have not entered Queue");
        }

        else if (randomNumber == 5) {
            System.out.println(randomNumber + " players have entered the queue");
            queue.printQueue();
        }
    }
}
