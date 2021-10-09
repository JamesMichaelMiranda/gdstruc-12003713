package com.gdstruc.module4;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int min = 1;
        int max = 7;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);

        Scanner scanner = new Scanner(System.in);
        String enterkey = scanner.nextLine();

        if(enterkey.equals("")) {

            System.out.println(random_int + " players have entered the queue");
        }



        ArrayQueue queue = new ArrayQueue(7);

        queue.add(new Player(1,"Nox", 20));
        queue.add(new Player(2,"Steven", 46));
        queue.add(new Player(3,"Var", 56));
        queue.add(new Player(4, "JT", 78));
        queue.add(new Player(5, "Lymtex", 80));


        queue.printQueue();


    }
}
