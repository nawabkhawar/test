package com.datastructures.java.LinkedList;

public class Node {
    public int data;
    public Node nextNode;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
