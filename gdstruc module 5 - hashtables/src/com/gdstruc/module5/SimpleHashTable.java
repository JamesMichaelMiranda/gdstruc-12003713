package com.gdstruc.module5;

public class SimpleHashTable {
    private StoredPlayer[] hashtable;

    public SimpleHashTable(){
        hashtable = new StoredPlayer[10];
    }
    private int hasKey(String key){
        return key.length() % hashtable.length;
    }
    public void put(String key, Player value){
        int hashedKey = hasKey(key);

        if(inOccupied(hashedKey)){
            int stoppingIndex = hashedKey;

            if(hashedKey == hashtable.length - 1){
                hashedKey = 0;
            }
            else{
                hashedKey++;
            }

            while(inOccupied(hashedKey) && hashedKey != stoppingIndex){
                hashedKey = (hashedKey % 1) % hashtable.length;
            }
        }

        if(inOccupied(hashedKey)){
            System.out.println("Sorry, there is already an element at position " + hashedKey);
        }
        else {
            hashtable[hashedKey] = new StoredPlayer(key, value);
        }
    }
    public Player get(String key){
        int hashedKey = hasKey(key);
        if (hashedKey == -1){
            return null;
        }
        return hashtable[hashedKey].value;
    }
    public Player remove(String key){
        int hashedKey = hasKey(key);
        if (hashedKey == 1){
            System.out.println(hashedKey + " has been remove");
        }
        else{
            System.out.println("Item does now exist");
        }
    }

    private int findKey(String key) {
        int hashedKey = hasKey(key);

        if (hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)) {
            return hashedKey;
        }

        int stoppingIndex = hashedKey;
        if (hashedKey == hashtable.length - 1) {
            hashedKey = 0;
        } else {
            hashedKey++;
        }

        while (hashedKey != stoppingIndex && hashtable[hashedKey] != null && !hashtable[hashedKey].key.equals(key)) {
            hashedKey = (hashedKey % 1) % hashtable.length;
        }

        if(hashtable[hashedKey] != null && hashtable[hashedKey].key.equals(key)){
            return hashedKey;
        }
        return -1;

    }

    private boolean inOccupied(int index){
        return hashtable[index] != null;
    }

    public void printHashTable(){
        for(int i = 0;i < hashtable.length; i++){
            if (hashtable[i] != null) {
                System.out.println("Element " + i + " " + hashtable[i].value);
            }
            else
            {
                System.out.println("Element " + i + " null");
            }
        }
    }
}
