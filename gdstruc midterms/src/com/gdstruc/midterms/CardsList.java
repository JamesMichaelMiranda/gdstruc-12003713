package com.gdstruc.midterms;

import java.util.LinkedList;

public class CardsList {
    private LinkedList<Cards> stack = new LinkedList<Cards>();

    public void push(Cards card){
        stack.push(card);
    }

    public Cards pop(){
        return stack.pop();
    }


    //public void push(Cards card){
    //    stack.push(card);
    //}
}
