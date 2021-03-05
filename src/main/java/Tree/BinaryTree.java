package Tree;

import java.util.Scanner;

public class BinaryTree {

    static Scanner scanner = null;
    public static void main(String args[]){
        scanner = new Scanner(System.in);
        //Create a tree
        Node n = createTree();
        System.out.println(n);
        printInOrder(n);
}

    private static void printInOrder(Node n) {
        if(n==null) return;

        printInOrder(n.getLeftNode());
        System.out.print(n.getData() + " ");
        printInOrder(n.getRightNode());

    }

    private static Node createTree() {

        Node root  = null;
        System.out.println("enter data");
        int data = scanner.nextInt();
        if(data==-1) return null;

        root = new Node(data);
        System.out.println("enter left node for data:" + data);
        root.setLeftNode(createTree());

        System.out.println("enter right node for data:" + data);
        root.setRightNode(createTree());


        return root;
    }

}
