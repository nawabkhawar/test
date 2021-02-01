package com.datastructures.java.LinkedList;

public class Test {

    public static void main(String args[]){
        Linked linked    = new Linked();
        linked.insert(5);
        linked.insert(15);
        linked.insert(20);
        linked.insert(25);

        linked.insertAtStart(2);
        linked.insertAt(22,4);
        linked.show();
        linked.deleteAt(3);
        linked.show();
    }
}

