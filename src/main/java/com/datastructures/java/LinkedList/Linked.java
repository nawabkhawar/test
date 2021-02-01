package com.datastructures.java.LinkedList;

public class Linked {
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if(head ==null){
            head = node;
        }else{
            Node nextNode = head;
            while(nextNode.nextNode !=null){
                nextNode = nextNode.nextNode;
            }
            nextNode.nextNode = node;
        }
    }

    public void show(){
        Node node = head;
        while(node.nextNode!=null){
            System.out.println("nodeData:" + node.data);
            node = node.nextNode;
        }
        //last node has nextNode ==null
        System.out.println("nodeData:" + node.data);
    }

    /*private void removeData(int data){

    }*/

    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if(head !=null){
            node.nextNode = head;
        }
        //both head ==null && head!=null , head should be
        //equal to node
        head = node;
    }

    public void insertAt(int data, int location){
        Node node = new Node();
        node.data = data;
        node.nextNode = null;

        if(location==0){
            insertAtStart(data);
        }else{
            Node n = head;
            for(int i=0;i<location-1;i++){
                n = n.nextNode;
            }
            node.nextNode = n.nextNode;
            n.nextNode = node;
        }
    }

    public void deleteAt(int location) {
        Node n = head;
        for (int i = 0; i < location - 1; i++) {
            n = n.nextNode;
        }
        Node toBeDeletedNode = n.nextNode;
        n.nextNode = toBeDeletedNode.nextNode;
        toBeDeletedNode.nextNode = null;
    }
}
